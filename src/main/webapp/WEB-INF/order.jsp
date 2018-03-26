<%@include file="//includes/header.jsp" %>


 Velkommen <%=user.getEmail()%>
 
 <% int[] itemList = (int[])request.getAttribute("itemlist"); %>
 
 <h1>Results</h1>
 <h3>Large Bricks</h3>
 <%=itemList[0]%>
 <h3>Medium Bricks</h3>
 <%=itemList[1]%> 
 <h3>Small Bricks</h3>
 <%=itemList[2]%> 
 <%@include file="//includes/footer.jsp" %>
