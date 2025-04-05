package com.jsp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
public class Login extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res){

		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		try {
			if (uname.equals("manindhar") && pass.equals("hello")) {

				HttpSession session = req.getSession();
				session.setAttribute("username", uname);

				
					res.sendRedirect("welcome.jsp");
				
			} else {
				
					res.sendRedirect("login.jsp");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
