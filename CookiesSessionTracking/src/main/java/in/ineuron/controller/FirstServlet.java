package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pname=request.getParameter("pname");
		String cost=request.getParameter("cost");
		
		Cookie c1=new Cookie("pname",pname);
		Cookie c2=new Cookie("cost",cost);
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher rdis=request.getRequestDispatcher("form2.html");
		rdis.forward(request, response);
		
	}

}
