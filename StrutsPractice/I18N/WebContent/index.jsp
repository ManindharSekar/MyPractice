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
<div style="border-color:maroon;color:red;font-size:50px">
<center>
<bean:message key="title"/>
</center>
</div>

<html:form action="reg">
<pre>
<bean:message key="id"/><html:text property="id"></html:text>
<bean:message key="name"/><html:text property="name"></html:text>
<bean:message key="email"/><html:text property="email"></html:text>
<bean:message key="address"/><html:textarea property="address"></html:textarea>
<html:submit><bean:message key="submit"/></html:submit>
</pre>
<a href="./changelang.do?Language=ta" style="border-style:double">Tamil</a>
<a href="./changelang.do?Language=hi" style="border-style:double">Hindi</a>
<a href="./changelang.do?Language=te" style="border-style:double">Telugu</a>
<a href="./changelang.do?Language=en" style="border-style:double">English</a>
</html:form>

</body>
</html>