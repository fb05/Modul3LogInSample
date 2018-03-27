<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
<%@include file="//includes/header.jsp" %>

Velkommen <%=user.getEmail()%>
<h1>Here you can check your current orders and history</h1>
<div class="container">
    <div class="row">
        <div class="table-responsive">
            <table class="table table-bordered">
                <thead>

                    <% int[] itemList = (int[]) request.getAttribute("itemlist");%>

                <h1>Results</h1>
                <h3>Large Bricks</h3>
                <%=itemList[0]%>
                <h3>Medium Bricks</h3>
                <%=itemList[1]%> 
                <h3>Small Bricks</h3>
                <%=itemList[2]%> 
                <%@include file="//includes/footer.jsp" %>
            </table>
        </div>
    </div>
</div>
<%@include file="//includes/footer.jsp" %>
