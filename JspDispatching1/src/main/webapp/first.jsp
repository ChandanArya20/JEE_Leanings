<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>welcome to first.jsp file</h1>
	
	 <%-- <%  pageContext.forward("second.jsp"); %>  --%>
	<%  pageContext.include("second.jsp"); %>
	
	<h1>End of first.jsp file</h1>
	
</body>
</html>