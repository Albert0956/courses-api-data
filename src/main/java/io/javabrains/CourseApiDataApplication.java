package io.javabrains;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApiDataApplication {

	@Value("${author.name}") private static String authorName;
	
	@Value("${author.department}") private static String authorDept;
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
		System.out.println("author Name : " + authorName);
		System.out.println("author department : " + authorDept);		
	}
}
