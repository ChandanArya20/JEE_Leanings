
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
              		
		<c:set var="x" value="12" />
		<c:if test="${x eq 12 }" var="result" scope="application">
			<h1>x is equal to 10</h1>
		</c:if>
		
		
		<h1>The result is : ${result }</h1>
		
		
	</body>
</html>



