package com.mani;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class GenerateSimplePDF_1 {
	public static void main(String[] args) {
	try {
		JasperReport jasperReport=JasperCompileManager.compileReport("D:\\iReport WorkSpace\\simpleReport.jrxml");
		List<String> l=new ArrayList<String>();
		l.add("TEST");
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(l);
		JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,new HashMap(),dataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint,"D:\\iReport WorkSpace\\simpleReport222"+RandomUtils.nextDouble()+".pdf");
	} catch (JRException e) {
		e.printStackTrace();
	}

	}

}
