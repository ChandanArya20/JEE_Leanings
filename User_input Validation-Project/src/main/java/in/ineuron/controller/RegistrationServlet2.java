package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg1")
public class RegistrationServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Servlet is loading...");
	}
	public RegistrationServlet2() {
		System.out.println("Servlet is initialized...");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



	}

}
