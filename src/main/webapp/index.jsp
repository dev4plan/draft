<%@ page import="ru.web.webproject.pages.GuestPage" %>
<%@ page import="java.io.FileOutputStream" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%! GuestPage guestPage = new GuestPage();%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Guest Page" %>
<%--    <p><% guestPage.getYandex(); %></p>--%>
    <p><%  out.println(guestPage.getYandexToPage()); %></p>
</h1>
<br/>
<a href="guest"> Guest Servlet</a>
</body>
</html>