<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
	
	<h1 align="center">Registration Page</h1>
	<br />
	<br />
	
	<c:url value="/registerPost" var="registerUrl" />
	
	<form name="registerForm" action="${registerUrl}" method="post">
	
		<table border="0" align="center">
		
			<tr>
				<td>USERNAME : </td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>FIRST NAME : </td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>LAST NAME : </td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>PASSWORD : </td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="Register" /></td>
			</tr>
		
		</table>
	
	</form>
	
	
	<h2 align="center">Click <a href='<c:url value="/login" />'>Here</a> to Login.</h2>
	
</body>
</html>