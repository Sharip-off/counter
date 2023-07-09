<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Favorite language</title>
</head>
<body>
<h1><%= "Your favorite language" %></h1>
<form action="count" method="post">
  <input type="radio" name="language" value="c++"><label>C++</label><br>
  <input type="radio" name="language" value="java"><label>Java</label><br>
  <input type="radio" name="language" value="python"><label>Python</label><br>
  <br/>
  <button type="submit">Submit</button>
</form>
<br/>
<br/>
<%--<a href="/count.jsp">Counter Page</a>--%>
</body>
</html>