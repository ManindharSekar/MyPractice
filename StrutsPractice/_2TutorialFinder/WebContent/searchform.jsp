<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
<s:textfield label="Enter language you want to search"key="language"/>
<s:submit/>

</s:form>


<!-- <form method="post" action="tutorials/getTutorial.action"> -->
<!-- <input id="language" name="language"/> -->
<!-- <input type="submit"/> -->

<!-- </form> -->

</body>
</html>