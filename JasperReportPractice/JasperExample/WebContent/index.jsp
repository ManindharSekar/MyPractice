<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.Connection" %>
     <%@ page import="java.sql.DriverManager" %>
     <%@ page import=" net.sf.jasperreports.engine.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Connection con=null;
try{
con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empinfo","root","Mani123");
String report="D:/iReport WorkSpace/report6.jrxml";
JasperReport jasperReport=JasperCompileManager.compileReport(report);
JasperPrint jasperprint=JasperFillManager.fillReport(jasperReport,null,con);
JasperExportManager.exportReportToPdfStream(jasperprint,response.getOutputStream());
response.getOutputStream().flush();
response.getOutputStream().close();
}catch(Exception e){
	out.println(e);
}

%>

</body>
</html>