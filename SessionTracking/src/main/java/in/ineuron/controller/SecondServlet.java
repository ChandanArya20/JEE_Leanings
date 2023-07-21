package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mob=request.getParameter("mob");
		String email=request.getParameter("email");
		
		HttpSession ss=request.getSession(false);
		ss.setAttribute("mob", mob);
		ss.setAttribute("email", email);
		
		RequestDispatcher rdis=request.getRequestDispatcher("form3.html");
		rdis.forward(request, response);
		
	}

}
