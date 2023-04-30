package spring.controllercon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.Model.Product;
import spring.service.productservice;

@Controller
@RequestMapping
public class Employeecontroller {

	
	@Autowired
	productservice productservice;
	
	
	@GetMapping("AddEmployee")
	public String addEmp() {
		return "AddEmployee";
	}
	
	@PostMapping("/insertEmployee")
	public String insertEmmployee(@ModelAttribute("insertEmployee") Product pro)
	
	{
		productservice.addEmpy(pro);
		return "AddEmployee";
			
	}
	
}
