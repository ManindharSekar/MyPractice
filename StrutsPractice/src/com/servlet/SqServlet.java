package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try {
			HttpSession session = req.getSession();
			int k=(Integer) session.getAttribute("k");
			k=k*k;
			PrintWriter pr=res.getWriter();
			pr.println("result is: "+k );
			pr.println("hello manindhar");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
