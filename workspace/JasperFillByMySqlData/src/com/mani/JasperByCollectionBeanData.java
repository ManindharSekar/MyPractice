package com.mani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class JasperByCollectionBeanData {
	public static void main(String[] args) {
		String outputFile="D:\\iReport WorkSpace\\"+"ReportCollectionListExampleInJava.pdf";
		String url="jdbc:mysql://localhost:3306/empinfo";
		String userName="root";
		String password="Mani123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, userName, password);
			String query="select *from empdetails";
			Statement createStatement = con.createStatement();
			ResultSet rs = createStatement.executeQuery(query);
			
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			while(rs.next()){
				Employee emp=new Employee();
				
				emp.setId(rs.getInt(1));
				emp.setFirstname(rs.getString(2));
				emp.setLastname(rs.getString(3));
				emp.setAddress(rs.getString(4));
				emp.setSalary(rs.getDouble(5));
				list.add(emp);
				
			
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
		
		HashMap<String, Object> parameter = new HashMap<String,Object>();
		
		parameter.put("CollectionBeanParam",dataSource);
		
	
			FileInputStream input = new FileInputStream(new File("D:\\iReport WorkSpace\\ReportCollectionList.jrxml"));
			
			JasperDesign jasperDesign=JRXmlLoader.load(input);
			
			JasperReport jasperReport=JasperCompileManager.compileReport(jasperDesign);
			
			JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, parameter,dataSource);
			
			//JasperViewer.viewReport(jasperPrint);
			
			FileOutputStream outputStream = new FileOutputStream(new File(outputFile));
			
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
			
			System.out.println("File Generated");
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JRException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
