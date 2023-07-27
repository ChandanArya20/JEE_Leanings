package in.ineuron.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/reg")
public class InputValidatorFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	static{
		System.out.println("Filter class is loaded...");
	}
	public InputValidatorFilter() {
		System.out.println("Filter is initialized....");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("We are in doFilter method...");
		String idErrorMsg="",nameErrorMsg="",ageErrorMsg="",emailErrorMsg="",mobErrorMsg="";
		boolean flag=false;
		PrintWriter out = response.getWriter();

		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String mob=request.getParameter("mob");

		if(id.equals("")) {
			idErrorMsg="Id is required";
			flag=true;
		}else {
			if(!id.startsWith("iNeuron-")) {
				idErrorMsg="Error : \"Id should start with iNeuron.ai-\"";
				flag=true;
			}
		}
		if(name.equals("")) {
			nameErrorMsg="Name is required";
			flag=true;
		}else {
			if(name.length()<3) {
				nameErrorMsg="Error : \"Name length should not be less than 3\"";
				flag=true;
			}
		}
		if(age.equals("")) {
			ageErrorMsg="Age is required";
			flag=true;
		}else {
			if(Integer.parseInt(age)<18 || Integer.parseInt(age)>30) {
				ageErrorMsg="Error : \"Age should be between 18 and 30\"";
				flag=true;
			}
		}
		if(email.equals("")) {
			emailErrorMsg="Email is required";
			flag=true;
		}else {
			if(!email.endsWith("@ineuron.ai")) {
				emailErrorMsg="Error : \"Email should end with @ineuron.ai\"";
				flag=true;
			}
		}
		if(mob.equals("")) {
			mobErrorMsg="Mobile No... is required";
			flag=true;
		}else {
			if(!mob.startsWith("91-")) {
				mobErrorMsg="Error : \"Mobile No... should start with 91-\"";
				flag=true;
			}
		}

		if(!flag) {

			chain.doFilter(request, response);
		}
		else {

			
			request.setAttribute("idErrorMsg", idErrorMsg);
			request.setAttribute("nameErrorMsg", nameErrorMsg);
			request.setAttribute("ageErrorMsg", ageErrorMsg);
			request.setAttribute("emailErrorMsg", emailErrorMsg);
			request.setAttribute("mobErrorMsg", mobErrorMsg);

			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}




	}

}
