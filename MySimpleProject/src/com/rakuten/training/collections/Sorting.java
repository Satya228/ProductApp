package com.rakuten.training.collections;

//import java.util.ArrayList;
//import java.util.Comparator;
import java.util.*;
public class Sorting {

	
	public static void main(String args[]) 
    {  
        ArrayList<String> 
            list = new ArrayList<String>(); 
  
         
        list.add("Satya"); 
        list.add("Soumya"); 
        list.add("Jit"); 
        list.add("Varnica"); 
        list.add("Sourav"); 
  
     
        System.out.println("Unsorted ArrayList: "
                           + list); 
 list.sort(Comparator.comparing(String::toString));

  
  System.out.println("Sorted ArrayList "
                           + "in Ascending order : "
                           + list); 
    } 
} 