package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
		out.println("<body style='background-color:cyan;'>");
		out.println("<h1 style='text-align:center;'>iNeuron Private Limited</h1>");
		out.println("<form method='post' action='" + response.encodeURL("./third") + "'>");
		out.println("<table style='margin:auto;'>");
		out.println("<tr><th>Qualification</th><td><input type='text' name='quali'/></td></tr>");
		out.println("<tr><th>Designation</th><td><input type='text' name='desig'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' value='Register'/></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		out.close();

		
	}

}
