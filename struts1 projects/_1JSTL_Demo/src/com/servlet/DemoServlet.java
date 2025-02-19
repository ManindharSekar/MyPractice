package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res){
		
		String name="Manindhar";
		req.setAttribute("label",name);
		
		
		Student s=new Student(1,"Ajith");
		req.setAttribute("stud", s);
		
		System.err.println();
		
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
