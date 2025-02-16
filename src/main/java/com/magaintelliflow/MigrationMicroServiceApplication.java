package com.magaintelliflow;

import com.magaintelliflow.entity.Employee;
import com.magaintelliflow.repository.EmployeeRepository;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MigrationMicroServiceApplication
//		implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(MigrationMicroServiceApplication.class, args);
	}


	@Autowired
	private EmployeeRepository employeeRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		// Insert initial users
//		List<Employee> employees = List.of(
//				new Employee(0, "John Doe", 101, 55000.0),
//				new Employee(0, "Jane Smith", 102, 62000.0),
//				new Employee(0, "Alice Johnson", 103, 58000.0),
//				new Employee(0, "Bob Brown", 101, 60000.0)
//		);
//		employeeRepository.saveAll(employees);
//		System.out.println("Initial employees inserted successfully.");
//	}


	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Employee Management API")
						.version("1.0")
						.description("API documentation for Employee Management application"));
	}

}
