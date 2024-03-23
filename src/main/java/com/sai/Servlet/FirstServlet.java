package com.sai.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data
		 String username=request.getParameter("username");
		 int age=Integer.parseInt(request.getParameter("age"));
		 //creation session object
		 HttpSession session=request.getSession();
		 session.setAttribute("username",username);
		 session.setAttribute("age",age);
		 //request dispatcher
		 RequestDispatcher dispatcher=request.getRequestDispatcher("Form2.html");
		 dispatcher.forward(request, response);
		}
		
	}
