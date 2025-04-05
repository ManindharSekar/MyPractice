<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="login">
<s:textfield label="LoginId" key="userId"></s:textfield>
<s:password label="Password" key="password"></s:password>
<s:submit></s:submit>
</s:form>

</body>
</html>