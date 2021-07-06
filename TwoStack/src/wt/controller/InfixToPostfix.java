package wt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wt.model.InfixToPostfixModel;

public class InfixToPostfix extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String input=request.getParameter("input");
		InfixToPostfixModel infpost=new InfixToPostfixModel(input);
		request.setAttribute("input", infpost.out1);
		request.setAttribute("output", infpost.out2);
		RequestDispatcher rd = request.getRequestDispatcher("InfixToPostfix.jsp");
		rd.forward(request, response);
	}

}
