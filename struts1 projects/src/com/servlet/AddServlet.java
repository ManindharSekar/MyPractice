package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//req.setAttribute("k", k);
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		
	
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		try {
			//rd.forward(req, res);
			res.sendRedirect("sq");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	/*	try {
			PrintWriter out=res.getWriter();
					out.println("result is :"+k);
		} catch (IOException e) {
			e.printStackTrace();
		
	}*/
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		try {
			PrintWriter out=res.getWriter();
					out.println("result is :"+k);
		} catch (IOException e) {
			e.printStackTrace();
		
	}
}
}

