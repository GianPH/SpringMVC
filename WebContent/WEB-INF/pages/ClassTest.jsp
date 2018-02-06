<%-- 
    Document   : ClassTest
    Created on : 2 Feb, 2018, 3:07:26 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ${em.idPegawai} <br>
        ${em.namaPegawai} <br>
        ${pr.namaPropinsi}<br>
        ${pr.id}<br>
        ${pr.idNegara}<br><br>
        
        <c:forEach items="${x}" var="y">
            ${y.id} - ${y.namaPropinsi} <br>
        </c:forEach>
        
    </body>
</html>
