package wt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wt.model.InfixToPrefixModel;

public class InfixToPrefix extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String input=request.getParameter("input");
		InfixToPrefixModel modeli=new InfixToPrefixModel(input);
		request.setAttribute("input", modeli.out1);
		request.setAttribute("output", modeli.out2);
		RequestDispatcher rd = request.getRequestDispatcher("InfixToPrefix.jsp");
		rd.forward(request, response);
	}

}
