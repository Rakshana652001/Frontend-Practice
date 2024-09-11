package com.chainsys.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Stream 
{
	public static void main(String[] args) 
	{
		Streams record1 = new Streams("Rakshana", 23);
		Streams record2 = new Streams("Anitha", 22);
		Streams record3 = new Streams("Ram Priya", 21);
		Streams record4 = new Streams("Sabitha", 20);
		Streams record5 = new Streams("Kayal", 24);
		Streams record6 = new Streams("Dilan", 24);
		
		List<Streams> addRecords = Arrays.asList(record1,record2,record3,record4,record5,record6);
		
		//Given a list of people with their names and ages, 
		//group them by age and collect the names of people in each age group.
		
		Map<Integer, List<String>> groupedByAge = addRecords.stream().collect(Collectors.groupingBy(Streams::getAge,Collectors.mapping(Streams::getName, Collectors.toList())));
	    groupedByAge.forEach((age, names) -> System.out.println("Age: " + age + " -> " + names));
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers); 
		

		int maxNumber = numbers.stream().max(Integer::compare).orElseThrow(NoSuchElementException::new);

		System.out.println(maxNumber);
		

		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	
		
		List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog");
		long count = words.stream().filter(word -> word.length() > 3).count();
		System.out.println(count);
		

		List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseWords);
		
		
		List<String> sortedWords = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedWords);
		
		
		List<String> distinctWords = words.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctWords);
	}
}