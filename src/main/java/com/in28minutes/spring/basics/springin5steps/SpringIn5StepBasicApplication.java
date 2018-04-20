package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepBasicApplication {
	
	//what are the beans?
	//What are the dependencies for the bean?
	//Where to search for beans?
	

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext= SpringApplication.run(SpringIn5StepBasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
	    int result= binarySearch.binarySearch(new int[] {12,4,6},3);
		
		System.out.println(result);
		
	}
}
