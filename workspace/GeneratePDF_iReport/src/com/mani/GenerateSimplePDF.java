package com.mani;


import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class GenerateSimplePDF {
	public static void main(String[] args) {

		try {
			JasperReport jasperReport=JasperCompileManager.compileReport("D:\\iReport WorkSpace\\report2.jrxml");
			
			JRDataSource jrDataSource = new JREmptyDataSource();
			JasperPrint jasperPrint = JasperFillManager.fillReport( jasperReport,null,jrDataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\iReport WorkSpace\\report2qwe.pdf");
			
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

}
