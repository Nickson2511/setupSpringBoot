// The package statement declares the namespace for the current class.
package com.javaguides.springboot;

// Importing necessary Spring Boot classes.
// SpringApplication is used to launch the Spring Boot application.
// SpringBootApplication is a convenience annotation that enables several features (like component scanning, auto-configuration, etc.).
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation is a combination of three annotations:
// - @EnableAutoConfiguration: Tells Spring Boot to configure the application automatically based on the dependencies in the classpath.
// - @ComponentScan: Tells Spring to scan for Spring components (e.g., controllers, services) in the specified package (com.javaguides.springboot).
// - @Configuration: Indicates that this class contains bean definitions for the application context.
@SpringBootApplication
public class SpringbootFirstAppApplication {

	// The main method is the entry point for the Java application.
	// It calls the SpringApplication.run() method to launch the Spring Boot application.
	public static void main(String[] args) {
		// SpringApplication.run() boots up the Spring context, loads all beans, and starts the embedded web server (Tomcat by default).
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
