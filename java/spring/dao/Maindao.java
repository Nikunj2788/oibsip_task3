package spring.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.Model.Product;

@Component
public class Maindao {
	HibernateTemplate hibernateTemplate;
	
	//add employee
	@Transactional
	public void addEmployee(Product pro) {
		hibernateTemplate.save(pro);
	}
	
	//get all employee
	public List<Product> getAllEmp(){
		return hibernateTemplate.loadAll(Product.class);
	}
	
	public Product getEmpyId(int id) {
		return hibernateTemplate.load(Product.class, id);
		
	}
	
	//updateQEmp
	@Transactional
	public void updateEmp(Product pro) {
		hibernateTemplate.update(pro);
	}
	
	//delete
	@Transactional
	public void delete(int id) {
		hibernateTemplate.delete(hibernateTemplate.load(Product.class,id));
	}
}
