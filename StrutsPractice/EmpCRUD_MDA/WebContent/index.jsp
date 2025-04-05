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

<html:form action="empcrudformsave">
<pre>
<bean:message key="id"/><html:text property="id"></html:text>
<bean:message key="name"/><html:text property="name"></html:text>
<bean:message key="email"/><html:text property="email"></html:text>
<bean:message key="address"/><html:textarea property="address"></html:textarea>
<html:submit property="submit"><bean:message key="save"/></html:submit>
<a href="./changelang.do?lang=en">English</a>
<a href="./changelang.do?lang=ta">Tamil</a>
</pre>
</html:form>
</body>
</html>