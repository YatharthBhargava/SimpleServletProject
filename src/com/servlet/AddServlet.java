package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter out = res.getWriter();
		out.println("result is " + (i + j));
		
		
		Cookie cookie = new Cookie("k", (i+j) + "");
		res.addCookie(cookie);
		
		RequestDispatcher rDispatcher = getServletContext().getRequestDispatcher("/sq");
		rDispatcher.include(req, res);
	}
}
