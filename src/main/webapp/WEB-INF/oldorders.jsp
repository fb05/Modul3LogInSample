<%-- 
    Document   : oldorders
    Created on : 23-03-2018, 14:45:29
    Author     : simon
--%>

<%@page import="PresentationLayer.ViewOrder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <%
                                    ViewOrder order = (ViewOrder)request.getAttribute("order");

                                %>
                                <%=order.getOrderID()%>
    </body>
</html>
