package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		HttpSession ss=request.getSession();
		ss.setAttribute("name", name);
		ss.setAttribute("age", age);
		
		RequestDispatcher rdis=request.getRequestDispatcher("form2.html");
		rdis.forward(request, response);
		
	}

}
