<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>

	<h1>${title}</h1>
	<br />
	<h1>${message}</h1>
	<br />
	<br />
	
	<h3>Click <a href='<c:url value="/registerGet" />'>Here</a> to back to Registration Page.</h3>
	
	<br />
	<br />
	
	<h3>Click <a href='<c:url value="/login" />'>Here</a> to go the Login Page.</h3>

</body>
</html>