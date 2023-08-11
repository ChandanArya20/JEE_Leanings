
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
         
        
		<table border=1px style="margin:auto;">
			<tr>
				<th>Key</th>
				<th>Value</th>
			</tr>
		</table>
		
		<table border=1px style="margin:auto;">
		<c:forEach var="p" items="${ param}">
			<tr>
			<td>${p.key}</td>
			<td>${p.value }</td>
			</tr>
		</c:forEach>
		</table>
		
		
		
	</body>
</html>



