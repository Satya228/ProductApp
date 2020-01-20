package com.rakuten.training.service;

import java.util.List;


import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;

public interface ProductService {

  int addNewProduct(Product toBeAdded);

  void removeProduct(int id);

  List<Product> findAll();

  //Product findById(int id);

//Review addReview(Review r,int id);

//List<Review> findallReviewsOfAProduct(int id);

Product findById1(int id);

//int addNewProduct1(Product toBeAdded);
  
}
