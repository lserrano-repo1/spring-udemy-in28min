
package com.in28minutes.spring.basics.springin5steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//what are the beans?  => @Component
	//What are the dependencies of a bean => @Autowired
	//Where to search for beans => No need
	
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result =binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
		
	}
	
}//eoc
