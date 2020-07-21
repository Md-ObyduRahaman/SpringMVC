<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		/* String name = (String) request.getAttribute("name");
		Integer rollnumber = (Integer) request.getAttribute("rollnumber");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>
		Hello My name is
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>This is help page</h1>
	<h1>
		My Rollnumber is ${rollnumber }
		<%-- <%=rollnumber%> --%>
	</h1>
	<h1>
		Date And Time is ${time }
		<%-- <%=time%></h1> --%>
		${marks }
		<h1>Marks</h1>
		<h1>
			<c:forEach var="item" items="${marks }">

				<c:out value="${item }"></c:out>

			</c:forEach>


		</h1>
</body>
</html>