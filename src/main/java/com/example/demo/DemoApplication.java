package com.example.demo;

import com.example.demo.entities.Product;
import com.example.demo.entities.Specifications;
import com.example.demo.services.SpecificationRepository;
import com.example.demo.services.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {
	//private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	//	Test test =new Test();
/*		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Test test = context.getBean("test",Test.class);
		Test test2 = context.getBean("test",Test.class);
		test2.number=8;
		context.close();
		System.out.println(test.getBeanTest().getName());
		System.out.println(test.getNumber());
		System.out.println(test2.getNumber());*/
	}
	@Bean
	public CommandLineRunner demo(ProductRepository repository1, SpecificationRepository repository2){
		return (args) -> {
			List<Specifications> specifications = new ArrayList<>();

			Specifications specification1=(new Specifications("power",1000));
			Specifications specification2=(new Specifications("size",150));
			specifications.add(specification1);
			specifications.add(specification2);
			Product product1=new Product("notebook",100,specifications);
			Product product2=new Product("notebook2",150);
			repository1.save(product1);
			repository1.save(product2);

/*			repository2.save(specification1);
			repository2.save(specification2);*/

			var products=repository1.findAll();
			for (Product product:products) {
				for (Specifications specification:
					 product.getSpecifications()) {
					System.out.println(specification.getKey());

				}
				System.out.println(product.getName());

			}
/*			var specifications=repository2.findAll();
			for (Specifications specification:specifications) {
				System.out.println(specification.getKey());

			}*/
		};

	}


//@GetMapping("/print")
//public String print(String name){
//		return "Hello World! "+name;
//}

}