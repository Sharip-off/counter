package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name = "counterServlet", value = "/counter")
public class CounterServlet extends HttpServlet {
    private final AtomicInteger cPlusPlus = new AtomicInteger(0);
    private final AtomicInteger java = new AtomicInteger(0);
    private final AtomicInteger python = new AtomicInteger(0);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language = req.getParameter("language");
        if ("c++".equals(language)){
            cPlusPlus.incrementAndGet();
        } else if ("java".equals(language)){
            java.incrementAndGet();
        } else if ("python".equals(language)) {
            python.incrementAndGet();
        }
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        req.setAttribute("cPlusPlus", cPlusPlus.get());
        req.setAttribute("java", java.get());
        req.setAttribute("python", python.get());

        RequestDispatcher ds = req.getRequestDispatcher("count.jsp");

        try {
            ds.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
