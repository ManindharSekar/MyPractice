package com.jsp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		
		HttpSession session=req.getSession();
		session.removeAttribute("username");
		session.invalidate();
		try {
			res.sendRedirect("login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
