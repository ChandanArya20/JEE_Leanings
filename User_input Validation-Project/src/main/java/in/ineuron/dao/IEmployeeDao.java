package in.ineuron.dao;

import in.ineuron.dto.Employee;

public interface IEmployeeDao {

	public String addEmployee(Employee employee);

	public Employee searchEmployee(Integer sid);

	public String updateEmployee(Employee employee);

	public String deleteEmployee(Integer sid);


}
