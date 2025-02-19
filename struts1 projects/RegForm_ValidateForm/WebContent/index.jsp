<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>REG Form</h1>
<html:form action="reg" onsubmit="return validateRF(this);">
<html:javascript formName="RF"/>
<pre>
Id:         <html:text property="id"/><html:errors property="id"/>
Name:       <html:text property="name"/><html:errors property="name"/>
Email:      <html:text property="email"/><html:errors property="email"/>
Salary:     <html:text property="salary"/><html:errors property="salary"/>
Credit Card:<html:text property="creditCard"/><html:errors property="creditCard"/>
Phone:      <html:text property="phone"/><html:errors property="phone"/>

<html:submit value="Register"></html:submit>
</pre>

</html:form>

</body>
</html>