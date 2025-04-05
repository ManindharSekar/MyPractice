package com.mani;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.joda.time.LocalDate;

public class AddEmp {
	
	public void addemp(String url,String user,String password){
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Employee id");
			int empId = s.nextInt();
			System.out.println("Enter Employee FirstName");
			String firstName=s.next();
			System.out.println("Enter Employee LastName");
			String lastName=s.next();
			System.out.println("Enter Employee DOB (format: yyyy-MM-dd):");
			String dateString = s.nextLine();
	        LocalDate date = LocalDate.parse(dateString);
	        java.sql.Date sqlDate = java.sql.Date.valueOf(date);
	        System.out.println("Ente Employee Gender");
	        String gender=s.next();
	        System.out.println("Enter Employee Department");
	        String department=s.next();
	        System.out.println("Enter Employee Salary");
	        double salary=s.nextDouble();
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement("insert into addemp values(?,?,?,?,?,?,?) ");
			ps.setInt(1,empId);
			ps.setString(2,firstName);
			ps.setString(3, lastName);
			ps.setDate(4,sqlDate);
			ps.setString(5, gender);
			ps.setString(6,department);
			ps.setDouble(7, salary);
			ps.executeUpdate();
			System.out.println("Employee Details Updaated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/empinfo";
		String user="root";
		String password="Mani123";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 for add Empoyee");
		System.out.println("Enter 2 for view Employee report");
		int choose=s.nextInt();
		AddEmp emp=new AddEmp();
		if(choose==1){
			emp.addemp(url,user,password);
		}else if(choose==2){
			
		}else{
			System.out.println("you enter invalid option");
		}

	}

}
