<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<% List l=(List)request.getAttribute("list"); %>

	id				name			email			address
 <%l.get(0); %>   <%l.get(1); %>  <%l.get(2); %>   <%l.get(3); %>
</pre>
</body>
</html>