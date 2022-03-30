package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.dao.EmployeesDao;
import model.dto.EmployeesDto;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	@Autowired
	EmployeesDao employeesDAO;

	public EmployeesServiceImpl() {}
	
	//este método me retorna es una lista
	public List<EmployeesDto> list(){
		return employeesDAO.list();
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

}
