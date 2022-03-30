package model.dto;

import java.sql.Date;

public class EmployeesDto {

	
		private int emp_no;
		private String birth_date;
		private String first_name,last_name, gender;
		private Date hire_date;
		
		public EmployeesDto() {
			// TODO Auto-generated constructor stub
		}
		public Integer getEmp_no() {
			return emp_no;
		}

		public void setEmp_no(Integer emp_no) {
			this.emp_no = emp_no;
		}

		public String getBirth_date() {
			return birth_date;
		}

		public void setBirth_date(String birth_date) {
			this.birth_date = birth_date;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getHire_date() {
			return hire_date;
		}

		public void setHire_date(Date hire_date) {
			this.hire_date = hire_date;
		}

	

}
