package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServletContextAndConfig extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		ServletContext context = getServletContext();
//		ServletContext ctContext = request.getServletContext(); // we can also use this it is one and the same thing
		
		String name = context.getInitParameter("name");
		out.println(name);
	}
}
