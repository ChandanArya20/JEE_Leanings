<%@ page language="java" %>
<%@ taglib prefix="myTag" uri="WEB-INF/tag.tld" %>
<%@ taglib prefix="ck" uri="WEB-INF/tag.tld" %>

<h1>Hello, this is index.jsp page</h1>
<%-- 
<myTag:hello>
	<h1>This is  the body of custom tag</h1>
</myTag:hello>
--%>
<h1>This is before custom tag</h1>
<ck:Age value="20">
	<h1 style="color:green; text-align:center;">Custom tag is very difficult</h1>
</ck:Age>
<h1>This is after the custom tag invocation</h1>