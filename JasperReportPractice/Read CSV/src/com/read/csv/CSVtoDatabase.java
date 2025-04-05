package com.read.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class CSVtoDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure();
		 SessionFactory sf=con.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction transaction = session.beginTransaction();
		 
		 try {
			CSVReader read=new CSVReader(new FileReader("C:/Users/Manju/Documents/My Notes/Book1.csv"));
			List<String[]> records=read.readAll();
			
			for(int i=1;i<records.size();i++){
				String[] record=records.get(i);
				String name=record[0];
				int age=Integer.parseInt(record[1]);
				String gender=record[2];
				
				Employee emp=new Employee();
				emp.setName(name);
				emp.setAge(age);
				emp.setGender(gender);
				session.save(emp);
				
				
			}
			
			transaction.commit();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
