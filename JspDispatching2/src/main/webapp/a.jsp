<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>From a.jsp</h1>
	<jsp:include page="b.jsp">
		<jsp:param value="20" name="age"/>
		<jsp:param value="Bahuarwa" name="address"/>
	</jsp:include>
	
</body>
</html>