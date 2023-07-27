package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		HttpSession ss=request.getSession();
		ss.setAttribute("name", name);
		ss.setAttribute("age", age);
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
		out.println("<body style='background-color:cyan;'>");
		out.println("<h1 style='text-align:center;'>iNeuron Private Limited</h1>");
		out.println("<form method='post' action='" + response.encodeURL("./second") + "'>");
		out.println("<table style='margin:auto;'>");
		out.println("<tr><th>Mobile</th><td><input type='tel' name='mob'/></td></tr>");
		out.println("<tr><th>Email</th><td><input type='email' name='email'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' value='next &#8407;'/></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		out.close();

		
	}

}
