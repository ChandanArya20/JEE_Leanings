package in.ineuron;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Initialization Parameters</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>ParameterName</th><th>ParameterValue</th></tr>");
		
		ServletConfig config=getServletConfig();
		Enumeration<String> parameters=getInitParameterNames();
		while(parameters.hasMoreElements()) {
			String parameterName=parameters.nextElement();
			String parameterValue=getInitParameter(parameterName);
			
			out.println("<tr>");
			out.println("<td>" + parameterName + "</td>");
			out.println("<td>" + parameterValue + "</td>");
			out.println("</tr>");			
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
