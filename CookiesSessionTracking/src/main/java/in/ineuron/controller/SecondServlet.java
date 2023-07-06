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

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String brand=request.getParameter("brand");
		String quantity=request.getParameter("quantity");
		
		Cookie c3=new Cookie("brand",brand);
		Cookie c4=new Cookie("quantity",quantity);
		response.addCookie(c3);
		response.addCookie(c4);
		
		RequestDispatcher rdis=request.getRequestDispatcher("form3.html");
		rdis.forward(request, response);
		
	}

}
