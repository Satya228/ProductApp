package com.stream.part1;
import java.util.*;
import java.util.stream.*;


// PART 1:-

//Problem1

public class streamPart1 {
	public static void main(String [] args)
	{
		List<String> strings = Arrays.asList("hi","hello","how", "are", "you","hie");
		Stream <String> stringsStream  = strings.stream();
		System.out.println("String with spaces");
	    strings.stream().forEach(s -> System.out.println("  " + s));
	    
	 //Problem 2   
	    System.out.println("String with no spaces");
	    strings.stream().forEach(System.out::println);
	    
	  //Problem 3
	    System.out.println("Transformed List Using API :");
	    strings.stream().map(e-> e+ "!").forEach(System.out::println);
	    strings.stream().map(e -> e.replace("hi","Namaste")).forEach(System.out :: println);
	    strings.stream().filter(e -> e.length()<4).forEach(System.out::println);
	    strings.stream().filter(e -> e.contains("b")).forEach(System.out ::println);
	    strings.stream().filter(e -> e.length()%2 == 0).forEach(System.out::println);
	    
	    
	    
	    

	    //PART 2:-
	   //PROBLEM 1
	    
	   Optional<String> rad = strings.stream().reduce((x,y) -> x.toUpperCase().concat(y.toUpperCase()));
	   System.out.println(rad);
	   
	    //Problem 2
	   rad = strings.stream().map(e -> e.toUpperCase()).reduce((x,y) -> x.concat(y));
	   System.out.println(rad);
	    
	   
	   //Problem 3
	   
	    

		
		
	}
	
	
}
