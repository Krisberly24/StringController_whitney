package model.dao;

import java.util.List;

import model.dto.*;
public interface EmployeesDao
{
	public int insert(EmployeesDto employeesDto);
	public EmployeesDto get(int emp_no);
	public int update(EmployeesDto employeesDto);
	public int delate(int emp_no);
	public List<EmployeesDto> list();


}
