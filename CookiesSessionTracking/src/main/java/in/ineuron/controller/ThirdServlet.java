package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String category=request.getParameter("categ");
		String manuf=request.getParameter("manuf");
		Cookie[] cookies =request.getCookies();
		String pname=cookies[0].getValue();
		String cost=cookies[1].getValue();
		String brand=cookies[2].getValue();
		String quantity=cookies[3].getValue();
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body bgcolor='lightgreen'>");
		out.println("<h1 style='color:red; text-align:center;'>Registration Details...</h1>");
		out.println("<center>");
		out.println("<table border='1'>");
		out.println("<tr><th>NAME</th><th>VALUE</th></tr>");
		out.println("<tr><th>Name</th><td>"+pname+"</td></tr>");
		out.println("<tr><th>Cost</th><td>"+cost+"</td></tr>");
		out.println("<tr><th>Barnd</th><td>"+brand+"</td></tr>");
		out.println("<tr><th>Quantity</th><td>"+quantity+"</td></tr>");
		out.println("<tr><th>Category</th><td>"+category+"</td></tr>");
		out.println("<tr><th>Manufaturer</th><td>"+manuf+"</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}
