<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc }</p>
<hr>

<%-- all field from model thats why field name must same with model variable --%> 
<h1>Welcome, ${user.userName}</h1>
<h1>your email address is, ${user.email }</h1>
<h1>Your password is, ${user.userPassword }</h1>

</body>
</html>