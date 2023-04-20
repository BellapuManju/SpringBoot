<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ="./ma" >Student list</a>
<table id="student">
<tr> 
<th>STUDENT ID</th>
<th>STUDENT NAME</th>
<th>STUDENT FEE</th>
<th>STUDENT LOCATION</th>
<th> action</th>
</tr>
<c:forEach items ="${sa}" var="stu" >>
<tr>
<td>${stu.id}</td>
<td>${stu.name}</td>
<td>${stu.fee}</td>
<td>${stu.location}</td>

				<td><a href="./delete?id=${stu.id}">delete</a> 
				<a href="./up?id=${stu.id}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>