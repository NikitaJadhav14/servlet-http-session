package com.jsp.http.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		HttpSession httpSession = req.getSession();
		String name = (String) httpSession.getAttribute("myUserName");

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>Welcome back to the application " + name + "</h1></body></html>");
		printWriter.write("<h1><a href='servlet3'>Logout</a> </h1>");

	}
}
