 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#person {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
#person td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}
#person tr:nth-child(even) {
	background-color: #f2f2f2;
}
#person tr:hover {
	background-color: #ddd;
}
#person th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
<a href="./sa">Person  person </a>
	<table id="person">
		<tr>
			<th>ptu ID</th>
			<th>ptu NAME</th>
			<th>ptu FEE</th>
			<th>ptu GMAIL</th>

			<th>Actions</th>
		</tr>
		<c:forEach items="${swa}" var="ptu">
			<tr>
				<td>${ptu.id}</td>
				<td>${ptu.name}</td>
				<td>${ptu.fee}</td>
				<td>${ptu.gmail}</td>
				



				<td><a href="./delete?id=${ptu.id}">delete</a> 
				<a href="./up?id=${ptu.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

</body>
</html>