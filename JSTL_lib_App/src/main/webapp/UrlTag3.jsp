
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
         
        
		<c:url value="core7.jsp" var="x">
			<c:param name="Java" value="Hyder"/>			
			<c:param name="Jee" value="Nitin"/>			
			<c:param name="Spring" value="NavinReady"/>			
		</c:url>
		<a href="${x }">Click here to get data</a>
	</body>
</html>



