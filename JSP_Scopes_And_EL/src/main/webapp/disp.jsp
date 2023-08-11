<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h1 style="color:green; text-align:center;">
	Page scope value is : <%= pageContext.getAttribute("p") %>
</h1>
<h1 style="color:green; text-align:center;">
	Request scope value is : <%= request.getAttribute("r") %>
</h1>
<h1 style="color:green; text-align:center;">
	Session scope value is : <%= session.getAttribute("s") %>
</h1>
<h1 style="color:green; text-align:center;">
	Application scope value is : <%= application.getAttribute("a") %>
</h1>

<%-- 
<h1 style="color:green; text-align:center;">
	scope value is : <%= pageContext.findAttribute("p") %>
</h1>
--%>

<h1 style="color:green; text-align:center;">
	User is :  ${initParam.user}
</h1>
<h1 style="color:green; text-align:center;">
	Password is :  ${initParam.password}
</h1>


<h1 style="color:green; text-align:center;">
	Name  is :  ${param.name}
</h1>
<h1 style="color:green; text-align:center;">
	Age is :  ${param.age}
</h1>


<h1 style="color:green; text-align:center;">
	Application scope value is : ${sessionScope.s}
</h1>

<h1 style="color:green; text-align:center;">
	Application scope value is : ${applicationScope.a}
</h1>




