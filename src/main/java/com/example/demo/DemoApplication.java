package com.example.demo;

import com.example.demo.entities.Specification;
import com.example.demo.entities.Product;
import com.example.demo.services.SpecificationRepository;
import com.example.demo.services.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			repository1.save(new Product("notebook",100));
			repository1.save(new Product("notebook2",150));
			var products=repository1.findAll();
			for (Product product:products) {
				System.out.println(product.getName());
			}
			repository2.save(new Specification("power",1000));
			repository2.save(new Specification("size",150));
			var specifications=repository2.findAll();
			for (Specification specification:specifications) {
				System.out.println(specification.getKey());
			}
		};

	}


//@GetMapping("/print")
//public String print(String name){
//		return "Hello World! "+name;
//}

}