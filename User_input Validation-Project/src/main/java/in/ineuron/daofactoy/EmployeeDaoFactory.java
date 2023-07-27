package in.ineuron.daofactoy;

import in.ineuron.dao.EmployeeDaoImpl;
import in.ineuron.dao.IEmployeeDao;

public class EmployeeDaoFactory {

	private EmployeeDaoFactory() {

	}

	private static IEmployeeDao EmployeeDao=null;

	public static IEmployeeDao getEmployeeDao() {

		if(EmployeeDao==null)
			EmployeeDao=new EmployeeDaoImpl();

		return EmployeeDao;
	}

}
