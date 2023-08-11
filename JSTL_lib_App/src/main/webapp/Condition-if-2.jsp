
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
              		
		<c:set var="x" value="12" />
		<c:choose>
			<c:when test="${param.p<0}">
				${param.p } is a negative number
			</c:when>
			<c:when test="${param.p>0}">
				${param.p } is a positive number
			</c:when>
			<c:otherwise>
				${param.p } is a zero
			</c:otherwise>
		</c:choose>
		
		
		
	</body>
</html>



