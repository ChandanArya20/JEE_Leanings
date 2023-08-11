
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
         
         <h1>Welcome in the main Pah</h1>
        
		<c:import url="core6.jsp" var="x">
			<c:param name="sub1" value="Java"></c:param>
			<c:param name="sub2" value="Jee"></c:param>
			<c:param name="sub3" value="Framwork"></c:param>
		</c:import>
		
		${x }
		${x }
	
	</body>
</html>



