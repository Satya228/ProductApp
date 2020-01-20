package com.rakuten.training.service;
import com.rakuten.training.domain.Product;
import java.util.List;



public interface ProductService {
	
	int addNewProduct(Product toBeAdded);
	void removeProduct(int id);
	List<Product> findAll();
	Product findById(int id);
	
}


