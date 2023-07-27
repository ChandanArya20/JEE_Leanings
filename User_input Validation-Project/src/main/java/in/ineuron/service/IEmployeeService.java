package in.ineuron.service;

import in.ineuron.dto.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee Employee);

	public Employee searchEmployee(Integer sid);

	public String updateEmployee(Employee Employee);

	public String deleteEmployee(Integer sid);

}
