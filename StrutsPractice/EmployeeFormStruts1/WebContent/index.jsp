<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>
<h1>Employee Registration Form</h1>

<html:form action="reg"  method="post"  >

<table>

<tr>
<td>Id</td>
<td><html:text property="id"/></td>
<td><html:errors property="e_id"/></td>
</tr>

<tr>
<td>Name</td>
<td><html:text property="name"/></td>
<td><html:errors property="e_name"/></td>
</tr>

<tr>
<td>Email</td>
<td><html:text property="email"/></td>
<td><html:errors property="e_email"/></td>
</tr>

<tr>
<td>Address</td>
<td><html:textarea property="address"/></td>
<td><html:errors property="e_address"/></td>
</tr>

<tr>
<td>Gender:Male</td>
<td><html:radio property="gender" value="male"/></td>
<td><html:errors property="e_gender"/></td>
</tr>

<tr>
<td>Gender:FeMale</td>
<td><html:radio property="gender" value="female"/></td>
<td></td>
</tr>


<tr>
<td>Hobbies</td>
<td><html:checkbox property="hobbies" value="hobbies1"/>Playing Cricket</td>
<td><html:errors property="e_hobbie"/></td>
</tr>

<tr>
<td></td>
<td><html:checkbox property="hobbies" value="hobbies2"/>singing song</td> 
<td></td>
</tr>

<tr>
<td></td>
<td><html:submit value="Register"/></td>
<td></td>
</tr>

</table>
</html:form>

</body>
</html>


