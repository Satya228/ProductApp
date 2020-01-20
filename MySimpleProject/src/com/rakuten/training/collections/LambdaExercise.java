package com.rakuten.training.collections;

import java.util.Arrays;

public class LambdaExercise {
	
	public static int eChecker(String s1, String s2)
	{
		if (s2.contains("e") && !s1.contains("e")) return 1;
		 else if(!s2.contains("e") && s1.contains("e")) return -1;
		 else return 0;
	}
	
	public static void sortByEUsingMethodReference(String[] strings) {
		Arrays.sort(strings,LambdaExercise::eChecker);

	}

  public static void sortByLen(String[] arr) {
 Arrays.sort(arr, (s1, s2)->s1.length()-s2.length());
 System.out.println(Arrays.asList(arr));
  }
  
  public static void sortByRevLen(String[] arr) {
 Arrays.sort(arr, (s1, s2)->s2.length()-s1.length());
 System.out.println(Arrays.asList(arr));
  }
  
  public static void sortByAlphaFirstChar(String[] arr) {
 Arrays.sort(arr, (s1, s2)->s1.charAt(0)-s2.charAt(0));
 System.out.println(Arrays.asList(arr));
  }
  
  public static void sortByPresenceOfE(String[] arr) {
 Arrays.sort(arr, (s1, s2) -> {
 if (s2.contains("e") && !s1.contains("e")) return 1;
 else if(!s2.contains("e") && s1.contains("e")) return -1;
 else return 0;
 });
 System.out.println(Arrays.asList(arr));
  }

  public static void main(String[] args) {
    String[] strarr = {"satya", "amitrajit", "soumya", "varnika", "sourav"};
    sortByLen(strarr); // first part
    sortByRevLen(strarr); //second part
    sortByAlphaFirstChar(strarr); //third part
    sortByPresenceOfE(strarr); //fourth part
    sortByEUsingMethodReference(strings);
  System.out.println(Arrays.asList(strings));

    String betterWord = betterString("Hello","Hi",(s1,s2)->(s1.length() > s2.length()));
    System.out.println(betterWord);
  }
  
    
    public  static String betterString(String word1,String word2,TwoStringPredicate tester) {
    	if (tester.isFirstBetter(word1, word2)) {
    		return word1;
    		
    	}
    	else {
    		return word2;
    	}
    }
    
  



public static <T> T betterElement(T param1,T param2,TwoElementPredicate<T> tester) {
	if(tester.isFirstBetter(param1, param2)) {
		return param1;
	}
	else
	{
		return param2;
	}
	
	}
}

	
