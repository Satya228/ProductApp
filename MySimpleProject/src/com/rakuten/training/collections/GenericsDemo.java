package com.rakuten.training.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GenericsDemo {
	
	
	
	public <T> T add(T arg1, T arg2) {
		return null;
	}
	
	public static void printAll(List<?> l) {
		for (Object o:l) {
			System.out.println(o);
			
		}
	//	l.add("abc");
	}
	
	
	public static double sumCollection(Collection<?extends Number> numCollection) {
		double sum =0;
		
		for (Number o : numCollection) {
			sum += o.doubleValue ();
			
		}
//		numCollection.add(123);
		return sum;
		
			
	}
	public static void main(String[]args)
	{
		List<Double> l = new ArrayList();
		l.add(1234.0);
		l.add(8766.0);
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
		double sum = sumCollection(l);
		double sum2 = sumCollection(iList);
		System.out.println(sum);
		System.out.println(sum2);
		printAll(iList);
		printAll(l);
		
		
		
		
		
		String[] strs = {"one","four","xylophone","ten"};
		List<String> sList =  new ArrayList<>(Arrays.asList(strs));
		
		Collections.sort(sList, new Comparator<String>() {
			@Override
			  public int compare(String s1, String s2) {
			    // TODO Auto-generated method stub
			    return s1.length() - s2.length();
			
		}
		//System.out.println(Arrays.asList(strs);
		});
		
	}
}