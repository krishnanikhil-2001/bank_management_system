<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
body {
	font-size:20px;
	
}
table{
	font-size:20px;
	
}
</style>

<body bgcolor= #ffddaa>
<img src="/images/head4.png"> <br><br>

<table align=center border=1 width=80% cellpadding=5 cellspacing=5>
<c:set var="count" value="0" scope="page" />
        	<c:forEach var="user" items="${userdetails}">
        	<c:set var="count" value="${count+1}" scope="page" />
<tr>
<td><h3> Account no: </h3> </td>
<td><h3> Accountholder name </h3></td>
<td><h3> Mail id </h3></td>
<td> <h3> Delete account </h3> </td></tr>
<tr><td>${userdetails.email}</td><td>${userdetails.person_name}</td>  
<td> <button ><a href="/accdelete">Delete</a></button></td></table></tr>
</c:forEach>
</table>



<table width=200%>
	
<tr height=300> <td></td> </tr>
</table>


</body>
</html>