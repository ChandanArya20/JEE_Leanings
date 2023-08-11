
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
		
		<h1>The value of (10/0) is = ${10/0 }</h1>
		<h1>The value of (0/0) is = ${0/0 }</h1>in case of jsp 4 div 2 is right or not?
		
		<h1>The value of (null+5) is = ${null+5 }</h1>
		<h1>The value of ("Ram"+6) is = ${"Ram"+6 }</h1>
		<h1>The value of (Ram+7) is = ${Ram+7 }</h1>
		
		
	</body>
</html>



