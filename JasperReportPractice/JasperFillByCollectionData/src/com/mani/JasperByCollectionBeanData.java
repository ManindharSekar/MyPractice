package com.mani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.setId(101);
		emp1.setFirstname("ilyas");
		emp1.setLastname("BZF");
		emp1.setAddress("Chennai");
		emp1.setSalary(22000.50);
		
		emp2.setId(102);
		emp2.setFirstname("pavithra");
		emp2.setLastname("BZF");
		emp2.setAddress("Pondicherry");
		emp2.setSalary(21000.30);
		
		emp3.setId(103);
		emp3.setFirstname("Manindhar");
		emp3.setLastname("BZF");
		emp3.setAddress("Thanjavur");
		emp3.setSalary(20000.75);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
		
		HashMap<String, Object> parameter = new HashMap<String,Object>();
		
		parameter.put("CollectionBeanParam",dataSource);
		
		try {
			FileInputStream input = new FileInputStream(new File("D:\\iReport WorkSpace\\ReportCollectionList.jrxml"));
			
			JasperDesign jasperDesign=JRXmlLoader.load(input);
			
			JasperReport jasperReport=JasperCompileManager.compileReport(jasperDesign);
			
			JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, parameter,new JREmptyDataSource());
			
			JasperViewer.viewReport(jasperPrint);
			
			FileOutputStream outputStream = new FileOutputStream(new File(outputFile));
			
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
			
			System.out.println("File Generated");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JRException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
