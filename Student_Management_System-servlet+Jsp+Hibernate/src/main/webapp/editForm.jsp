<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Result</title>
</head>
<body>
	<c:choose>
		<c:when test="${student ne null }">
			<form method='post' action='controller/updateform'>
			<table style='margin:auto'>		
				<tr>
					<th>Id</th>
					<td><input type='number' name='sid' min='1' value='${student.getSid() }' readonly></td>
				</tr>
				<tr>
					<th>Name</th>
					<td><input type='text' name='sname' value='${student.getSname() }'></td>
				</tr>
				<tr>
					<th>Age</th>
					<td><input type='number' name='sage' min='1' value='${student.getSage() }' ></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><input type='text' name='saddress' value='${student.getSaddress() }' ></td>
				</tr>
				<tr>
					<th></th>
					<td><input type='submit' value='Update' ></td>
				</tr>			
			</table>
			</form>
		</c:when>
		<c:otherwise>
			<h1 style='color:red; text-align:center;' >Data not found...</h1>		
		</c:otherwise>	
	</c:choose>
	
</body>
</html>






