
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
		<c:set var="a" value="10" />
		<c:set var="b" value="20" />
		<c:set var="user" value="${param.username}" />
		<c:set var="pass" value="${param.password}" />
		<c:set var="mult" value="${a*b }" scope="application"></c:set>
		<h1 style="color: green; text-align:center;">The result is : <c:out value="${a+b}"/></h1>
		<h1 style="color: green; text-align:center;">The multiplication is : <c:out value="${mult}"/></h1>
		<h1 style="color: green; text-align:center;">The user is : <c:out value="${user}" default="iNeuron"/></h1>
		<h1 style="color: green; text-align:center;">The user is : <c:out value="${pass}" default="12345678"/></h1>
	</body>
</html>