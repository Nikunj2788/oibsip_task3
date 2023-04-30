package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import spring.Model.Product;
import spring.dao.Maindao;

@Component
@Service
public class productservice {

	
	@Autowired
	Maindao maindao;
	
	//add employee
	public void addEmpy(Product pro) {
		maindao.addEmployee(pro);
	}
	
	//get all emp
	public List<Product> getAllempyList()
	{
		return maindao.getAllEmp();
		
	}
	
	//getbyid
	public Product getByid(int id) {
		return maindao.getEmpyId(id);
	}
	
	
	//updateEmpoyee
	public void updateEmp(Product pro) {
		maindao.updateEmp(pro);
	}
	
	//delete
	public void delete(int id) {
		maindao.delete(id);
	}
	
}
