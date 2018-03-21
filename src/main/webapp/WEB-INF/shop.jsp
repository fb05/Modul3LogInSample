<%@include file="//includes/header.jsp" %>
        <h1>Shop</h1>
        Her kan du bestille din ordre!

    Velkommen <%=user.getEmail()%>
        <table>
            <tr><td>Afgiv ordre</td>
                <td>
                    <form name="shop" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="shop">
                        Length:<br>
                        <input type="number" name="length" value="5">
                        <br>
                        Width:<br>
                        <input type="number" name="width" value="5">
                        <br>
                        Height:<br>
                        <input type="number" name="height" value="5">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
<%@include file="//includes/footer.jsp" %>
