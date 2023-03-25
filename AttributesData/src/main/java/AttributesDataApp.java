import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns="/start")
public class AttributesDataApp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		context.setAttribute("name", "chandan");
		context.setAttribute("age", 20);
		context.setAttribute("address", "Bettiah");
		context.setAttribute("marks", 95.7);
		
		request.setAttribute("name", "Raghav");
		request.setAttribute("age", 30);
		
		PrintWriter out=response.getWriter();
		
//		Enumeration<String> attributes=context.getAttributeNames();
//		while(attributes.hasMoreElements()) {
//			String attributesName=attributes.nextElement();
//			Object attributeValue=context.getAttribute(attributesName);
//		}
		
//		Enumeration<String> requestAttributes =request.getAttributeNames();
//		while(requestAttributes.hasMoreElements()) {
//			String attributesName=requestAttributes.nextElement();
//			Object attributeValue=context.getAttribute(attributesName);
//		}
//		
//		request.removeAttribute("name");
		
		
		
		out.println("<html><head><title>Attribute Data</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:blue;'>Dynamic information in ApplicationScope...</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>AttributeName</th><th>AttributeValue</th></tr>");
		Enumeration<String> attributeNames = context.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String attributeName = (String) attributeNames.nextElement();
			Object attributeValue = context.getAttribute(attributeName);
			out.println("<tr>");
			out.println("<td>" + attributeName + "</td>");
			out.println("<td>" + attributeValue + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
	}
}
