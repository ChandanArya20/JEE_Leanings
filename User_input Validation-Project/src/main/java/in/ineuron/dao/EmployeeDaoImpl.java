package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Employee;
import in.ineuron.utils.JdbcUtils;

public class EmployeeDaoImpl implements IEmployeeDao {

	Connection connection=null;
	PreparedStatement stm=null;
	ResultSet resultSet=null;

	@Override
	public String addEmployee(Employee employee) {

		String query="insert into EmployeeRecord(name,age,email,mob)values(?,?,?,?)";
		try {
			connection=JdbcUtils.getJdbcConnection();

			if(connection!=null)
				stm=connection.prepareStatement(query);

			if(stm!=null) {

				stm.setString(1, employee.getName());
				stm.setInt(2, employee.getAge());
				stm.setString(3, employee.getEmail());
				stm.setString(4, employee.getMob());

				int flag=stm.executeUpdate();

				if(flag==1)
					return "success";
			}

		} catch (SQLException | IOException e) {
			return "failure";
		}
		return "failure";
	}

	@Override
	public Employee searchEmployee(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteEmployee(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}



}
