<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
	<head>

		<title>your data</title>
		
		<style type="text/css">
			table,th,td{
				border:1px solid black;
				border-collapse:collapse;
				margin:0 auto;
			}
			
		</style>
	</head>
	<body>
		<c:choose>
			<c:when test="${student ne null }">
					<h1 style="color:green; text-align:center;">Student Records</h1>
				<table>
					<tr>
						<th>Id</th>
						<td>${student.getSid() }</td>
					</tr>
					<tr>
						<th>Name</th>
						<td>${student.getSname() }</td>
					</tr>
					<tr>
						<th>Age</th>
						<td>${student.getSage() }</td>
					</tr>
					<tr>
						<th>Address</th>
						<td>${student.getSaddress() }</td>
					</tr>
				
				</table>
			
			</c:when>
			<c:otherwise>
				<h1 style="color:red; text-align:center;">Record not found to display</h1>
			</c:otherwise>
		
		</c:choose>
	
	</body>
</html>