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

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class JasperBySqlData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/stdinfo";
		String username = "root";
		String password = "Mani123";

		String outputFile = "D:\\iReport WorkSpace\\" + "StudentReport.pdf";

		String query = "select* from details";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username,
					password);
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			ArrayList<Student> al = new ArrayList<Student>();

			while (rs.next()) {
			
				Student s = new Student();
				s.setStdno(rs.getInt(1));
				s.setStdname(rs.getString(2));
				s.setSub1(rs.getString(3));
				s.setSub2(rs.getString(4));
				s.setSub3(rs.getString(5));
				al.add(s);

				JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(al);
				//JRResultSetDataSource dataSource = new JRResultSetDataSource(rs);
				FileInputStream inputStream = new FileInputStream(new File(
						"D:\\iReport WorkSpace\\studentReportMain.jrxml"));
				JasperDesign jd = JRXmlLoader.load(inputStream);
				JasperReport compileReport = JasperCompileManager
						.compileReport(jd);
				JasperPrint jp = JasperFillManager.fillReport(compileReport,
						null, dataSource);
				FileOutputStream outputStream = new FileOutputStream(new File(
						outputFile));
				JasperExportManager.exportReportToPdfStream(jp, outputStream);

				System.out.println("File Generated");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JRException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
