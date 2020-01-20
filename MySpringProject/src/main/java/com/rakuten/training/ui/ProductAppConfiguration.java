package com.rakuten.training.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.ProductDAOinMemimpl;
import com.rakuten.training.service.ProductService;
import com.rakuten.training.service.ProductServiceImpl;

@Configuration
@ComponentScan(basePackages = " com.rakuten.training")
public class ProductAppConfiguration {}
