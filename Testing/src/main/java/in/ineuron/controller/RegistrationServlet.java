package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Servlet is loading...");
	}
	public RegistrationServlet() {
		System.out.println("Servlet is initialized...");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:green; text-align:center; '>You have been registered successfully...</h1>");

	}

}













