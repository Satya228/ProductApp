package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static <T> List<T> allmatch(List<T> l, Predicate<T> p)
	{
		List<T> newList = new ArrayList<>();
		for(String s:l)
		{
			if(p.test(s))
				newList.add(s))
		}
		return newList;
		
	}
	public static void main(String[] args)
	{
		String [] str= {" hi","i","am","an","developer"};
		List<String> l = new ArrayList<>(Arrays.asList(str));
		List<String> shortWords = Match.allMatches(words, s -> s.length() < 4);
		List<String> wordsWithB = Match.allMatches(words, s -> s.contains("b"));
		List<String> evenLengthWords = Match.allMatches(words, s -> (s.length() % 2) == 0);
		System.out.println(shortWords);
		System.out.println(wordsWithB);
		System.out.println(evenLengthWords);
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = Match.allMatches(nums, n -> n>500);
		System.out.println(bigNums);
		

		


		
	}
	
}
