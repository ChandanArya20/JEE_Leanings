package in.ineuron.service;

import in.ineuron.dao.IEmployeeDao;
import in.ineuron.daofactoy.EmployeeDaoFactory;
import in.ineuron.dto.Employee;

public class EmployeeServiceImpl implements IEmployeeService{


	IEmployeeDao employeeDao=null;
	@Override
	public String addEmployee(Employee employee) {
		employeeDao=EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee searchEmployee(Integer sid) {
		employeeDao=EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.searchEmployee(sid);
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeDao=EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(Integer sid) {
		employeeDao=EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.deleteEmployee(sid);
	}






}
