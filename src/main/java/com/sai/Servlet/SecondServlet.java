package com.sai.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		 String qualification=request.getParameter("qualification");
		 String  designition=request.getParameter("designition");
		 //creation session object
		 HttpSession session=request.getSession(false);
		 session.setAttribute("qualification",qualification);
		 session.setAttribute("designition",designition);
		 //request dispatcher
		 RequestDispatcher dispatcher=request.getRequestDispatcher("Form3.html");
		 dispatcher.forward(request,response);
	}
}
