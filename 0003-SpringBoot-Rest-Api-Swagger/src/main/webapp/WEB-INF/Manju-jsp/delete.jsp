<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/delete" method ="post"></form>
<table>
<tr>
<td> id</td>
<td><input type="text" name="id">
</td>

<tr>
<td> name</td>
<td><input type="text" name="name">
</td>
</tr>

<tr>
<td> fee</td>
<td><input type="text" name="fee">
</td>
</tr>
<tr>
<td> location</td>
<td><input type="text" name="location">
</td>
</tr>
<tr>
<td><input  type="text" value="delete">
</td>
</tr>
</table>
</body>
</html>