package com.coforge.training.shopstop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg;
    /**
     * Default constructor. 
     */
	public HelloWorld() {
		msg ="HttpServlet Demo";
	}
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set the content type of the page 
		response.setContentType("text/html");
		
		// Write the msg on the Webpage
		PrintWriter out = response.getWriter();
		out.println("<h1> Hello World From Servlet</h1>");
		out.println("<p> Web Application using Servlet</p>");
		out.println("<h1>"+  msg + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
