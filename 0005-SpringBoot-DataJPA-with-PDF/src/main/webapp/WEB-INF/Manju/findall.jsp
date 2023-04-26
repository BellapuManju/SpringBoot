 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#student {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
#student td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}
#student tr:nth-child(even) {
	background-color: #f2f2f2;
}
#student tr:hover {
	background-color: #ddd;
}
#student th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
<a href="./sa">Stucent  student </a>
	<table id="student">
		<tr>
			<th>emp ID</th>
			<th>emp NAME</th>
			<th>emp loction</th>

			<th>Actions</th>
		</tr>
		<c:forEach items="${swa}" var="stu">
			<tr>
				<td>${stu.id}</td>
				<td>${stu.name}</td>
				<td>${stu.location}</td>



				<td><a href="./delete?id=${stu.id}">delete</a> 
				<a href="./up?id=${stu.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>

</body>
</html>