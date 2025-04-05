<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><bean:message key="title"/></h1>
<html:form action="reg">
<bean:message key="id"/>:<html:text property="id"></html:text><html:errors property="e_id"/>
<bean:message key="name"/>:<html:text property="name"></html:text><html:errors property="e_name"/>
<bean:message key="email"/>:<html:text property="email"></html:text><html:errors property="e_email"/>
<bean:message key="salary"/>:<html:text property="salary"></html:text><html:errors property="e_salary"/>
<html:submit property="submit"><bean:message key="save"/></html:submit>
<html:submit property="submit"><bean:message key="update"/></html:submit>
</html:form>
<a href="./changeLang.do?lang=ta">Tamil</a>
<a href="./changeLang.do?lang">English</a>
</body>
</html>