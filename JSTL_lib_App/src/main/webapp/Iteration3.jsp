
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
         
        
		<c:forTokens items="kohli.dhoni.sachin.surya" delims="." var="name">
		
			<h1>${ name}</h1>
		</c:forTokens>
		
		
		
	</body>
</html>



