<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counting result</title>
</head>
<body>
<h1>Counting results</h1>


<p>C++ count: <%= request.getAttribute("cPlusPlus") %></p>
<p>Java count: <%= request.getAttribute("java") %></p>
<p>Python count: <%= request.getAttribute("python") %></p>




<a href="index.jsp">Beck to Form</a>
</body>
</html>
