 package net.bibay.services;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bibay.interfaces.IProductRepository;
import net.bibay.models.*;



@Service
public class ProductService {

	@Autowired
	private IProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll(); 
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	public Product getByName(String name) {
		return repo.getProductByName(name);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
	
}
