<%@include file="//includes/header.jsp" %>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to the shop</title>
    </head>
    <body>

        Velkommen <%=user.getEmail()%>
        <h1>Choose size of house to build with bricks</h1>
        <table>
            <tr><td>Submit values:</td>
                <td>
                    <form name="shop" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="addorder">
                        Height:<br>
                        <input type="number" name="height" value="5">
                        <br>
                        Length (minimum 5)<br>
                        <input type="number" name="length" value="5">
                        <br>
                        Width (minimum 5)<br>
                        <input type="number" name="width" value="5">
                        <br>
                        <a href="FrontController?command=addorder"><button>Gå til ordre</button></a>
                    </form>
                </td>
        </table>
    </body>
</html>
