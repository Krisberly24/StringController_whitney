package model.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import model.dto.EmployeesDto;

public class EmployeesDaoImpl implements EmployeesDao {
	private String insert="INSERT INTO Employees VALUES(??????)";
	private String select="SELECT * FROM Employees where emp_no=?";
	private String update="UPDATE Employees SET  emp_no=?, birth_date=?; first_name=?,last_name=?, gender=?,hire_date=? ";
	private String delete="DELETE Employees Where emp_no=?";
	private String list = "SELECT * FROM Employees";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public EmployeesDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(EmployeesDto employeesDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeesDto get(int emp_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(EmployeesDto employeesDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delate(int emp_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmployeesDto> list() {
		//convierte una clase a un objeto convierte el resultado de la consulta al dto que tengo definido para el resultado de esa consulta
		List<EmployeesDto> listEmployees = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(EmployeesDto.class));
		return listEmployees;
	}

}
