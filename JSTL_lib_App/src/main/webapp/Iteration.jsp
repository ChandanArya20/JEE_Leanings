
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head><title>output</title></head>
	<body>
         
        <table border=1px style="margin:auto;">   		
		<c:forEach var="i" begin="1" end="10" step="1">
			<tr>
			<td>2*${i }</td>
			<td>${2*i }</td>
			</tr>
		</c:forEach>
		</table>  
		<% 
			String playerNames[]={"Kohli","Dhoni","Gill","Rohit","Rahul"};
			request.setAttribute("playerName", playerNames);
			List<String> teams=new ArrayList<String>();
			teams.add("RCB");
			teams.add("CSK");
			teams.add("GT");
			teams.add("MI");
			teams.add("KKR");
			request.setAttribute("teams", teams);
		
		%>
		
		<table border=1px style="margin:auto;">
		<c:forEach var="player" items="${ playerNames}">
			<tr>
			<td>Player name is : </td>
			<td>${player }</td>
			</tr>
		</c:forEach>
		</table>
		
		<table border=1px style="margin:auto;">
		<c:forEach var="team" items="${ teams}">
			<tr>
			<td>Team name is : </td>
			<td>${team }</td>
			</tr>
		</c:forEach>
		</table>
		
	</body>
</html>



