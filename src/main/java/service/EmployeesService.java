package service;

import java.util.List;

import model.dto.EmployeesDto;


public interface EmployeesService {
	
		public int insert(EmployeesDto employeesDto);
		public EmployeesDto get(int emp_no);
		public int update(EmployeesDto employeesDto);
		public int delate(int emp_no);
		public List<EmployeesDto> list();
}
