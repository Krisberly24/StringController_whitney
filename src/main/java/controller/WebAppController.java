package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebAppController
{
	@RequestMapping("/") //con esto le digo cual es la ruta 
	public String getHome()
	{
		return "index";
	}
	
	
	@RequestMapping("/employees")
	public String getEmployees()
	{
		return "employees";
	}

}
