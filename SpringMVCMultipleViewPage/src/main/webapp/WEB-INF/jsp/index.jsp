<%@page import="java.util.List"%>
<html>
<body>
<a href="helloagain">Javatpoint Tutorials</a>
<% 
	String name=(String)request.getAttribute("name");
	Integer id=(Integer)request.getAttribute("id");
	List<String> friends=(List<String>)request.getAttribute("f");
%>
<h3>My name is <h1><%= name %></h1></h3>
<h3>My id is <h1><%= id %>
<%
	for(String s :friends)
	{
		out.println(s);
	}

%>

</h1></h3>


</body>
</html>
