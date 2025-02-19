<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>

<a href https://www.youtube.com/watch?v=cYc3FjhMMzI&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=32>click here to learn how to create login in jsp</a>

</body>
</html>