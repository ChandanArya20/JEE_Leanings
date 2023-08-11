
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
		
		<c:catch var="e">
			<jsp:scriptlet>
				Integer x = Integer.parseInt("Ten");
				out.println(x);
			</jsp:scriptlet>
		</c:catch>
		<c:if test="${!empty e }">
			<br/><h1 style='color:red; text-align: center;'>The exception raise is :: ${e}</h1>
		</c:if>
		<h1 style='color:blue; text-align: center;'>The code after the evaluation of dynamic content</h1>
		
	</body>
</html>



