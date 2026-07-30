<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title> Banking Project </title>
</head>
<style>
body {
	font-size:20px;
	
}
table{
	font-size:20px;
	
}
</style>

<body bgcolor= #ffdaa>
<img src="/images/head4.png"> <br><br>


<table align=center border=1 width=80% cellpadding=5 cellspacing=5>
<c:forEach var="details" items="${userdetail}" varStatus="status">

<tr><td>Account Number</td><td>${details.acc_num}</td></tr><tr><td>Name</td><td>${details.person_name}</td></tr><tr><td>Address</td><td>${details.address}</td></tr><tr><td>Mobile Number</td><td>${details.mobile_num}</td></tr> <tr><td>Email ID</td><td>${details.email}</td></tr> <tr><td>Balance</td><td>${details.balance}</td></tr>
</c:forEach>
</table>
<a href=custmainpage.html> Back </a> 
<table width=100%>
<tr height=200> <td></td> </tr>
</table>

</body>
</html>