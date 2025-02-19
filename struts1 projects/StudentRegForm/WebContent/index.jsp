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
<pre>
<html:form  action="StudentReg" method="post">
Name:<html:text property="name"/><html:errors property="name_s"/>
Email:<html:text property="email"/><html:errors property="email_s"/>
Address:<html:textarea property="address"/><html:errors property="address_s"/>
<html:submit value="Register"></html:submit>

</html:form>
</pre>
</body>
</html>