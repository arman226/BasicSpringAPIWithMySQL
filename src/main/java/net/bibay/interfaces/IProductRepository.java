package net.bibay.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.bibay.models.Product;

public interface IProductRepository extends JpaRepository<Product,Integer>{
	
	@Query(value="SELECT * FROM product WHERE name=:name LIMIT 1", nativeQuery=true)
	public Product getProductByName (@Param("name") String name);

}
