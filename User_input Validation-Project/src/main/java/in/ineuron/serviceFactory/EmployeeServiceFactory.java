package in.ineuron.serviceFactory;

import in.ineuron.service.EmployeeServiceImpl;
import in.ineuron.service.IEmployeeService;

public class EmployeeServiceFactory {

	private EmployeeServiceFactory() {

	}

	private static IEmployeeService employeeService=null;
	public static IEmployeeService getEmployeeService() {

		if(employeeService==null)
			employeeService=new EmployeeServiceImpl();

		return employeeService;

	}
}
