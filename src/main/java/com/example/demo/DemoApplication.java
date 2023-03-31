package com.example.demo;

import entities.Product;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ProductServices;

import java.util.logging.Logger;

@SpringBootApplication
//@RestController
public class DemoApplication {
	//private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	//	Test test =new Test();
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Test test = context.getBean("test",Test.class);
		Test test2 = context.getBean("test",Test.class);
		test2.number=8;
		context.close();
		System.out.println(test.getBeanTest().getName());
		System.out.println(test.getNumber());
		System.out.println(test2.getNumber());
	}
	public CommandLineRunner demo(ProductServices repository){
		return (args) -> {
			repository.save(new Product("notebook",100));
			repository.save(new Product("notebook2",150));
			var products=repository.findAll();
			for (Product product:products) {
				System.out.println(product.getName());
			}

		};

	}

//@GetMapping("/print")
//public String print(String name){
//		return "Hello World! "+name;
//}

}