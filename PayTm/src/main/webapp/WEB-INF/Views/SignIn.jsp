<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 align="center">Welcom To PayTm signUp</h4>
<form:form>
<table>
<tr><td>FirstName</td>
<td><form:input path="firstName"/>

<tr><td>LastName</td>
<td><form:input path="lastName"/>
</tr>

<tr><td>Email</td>
<td><form:input path="email"/>
</tr>

<tr><td>Mobile_Number</td>
<td><form:input path="mobileNo"/>
</tr>

<tr><td>Password</td>
<td><form:input path="password"/>
</tr>
t
</table>
</form:form>
</body>
</html>