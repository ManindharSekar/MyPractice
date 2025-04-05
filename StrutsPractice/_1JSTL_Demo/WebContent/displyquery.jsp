<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/myinfo" user="root" password="Mani123"/>
<sql:query var="rs" dataSource="${db}">select *from stud</sql:query>

<c:forEach items="${rs.rows}"  var="s">
<br> <c:out value="${s.id}"></c:out>:<c:out value="${s.name}"></c:out>:<c:out value="${s.cgpa}"></c:out>

</c:forEach>
</body>
</html>