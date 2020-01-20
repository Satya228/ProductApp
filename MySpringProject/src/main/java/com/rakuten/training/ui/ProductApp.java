package com.rakuten.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakuten.training.ui.ProductConsoleUI;

public class ProductApp {

  public static void main(String[] args) {

   // ApplicationContext springContainer =
     //   new ClassPathXmlApplicationContext("applicationContext.xml");
    ApplicationContext springContainer =
			  new AnnotationConfigApplicationContext(ProductAppConfiguration.class);
    

    ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);

    ui.createProductWithUI();
  }

}



