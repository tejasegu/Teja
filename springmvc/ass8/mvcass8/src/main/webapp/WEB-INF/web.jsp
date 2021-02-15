<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/mvcass8/web.jsp?Lang=en">English</a>
<a href="/mvcass8/web.jsp?Lang=fr">French</a>
<a href="/mvcass8/web.jsp?Lang=vi">Vietnamese</a>
<form action="/getNothing">

<table>
	<tr>
	<td><spring:message code="web.username"/></td>
	<td><input type="text" name="username"/></td>
	</tr>
	<tr>
	<td><spring:message code="web.password"/></td>
	<td><input type="password" name="password" /></td>
	</tr>
	<tr>
	<td><spring:message code="web.submit"/></td>
	<td><button type="submit"></button></td>
	</tr>
</table>

</form>
</body>
</html>