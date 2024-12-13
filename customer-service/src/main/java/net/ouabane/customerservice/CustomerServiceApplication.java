package net.ouabane.customerservice;

import net.ouabane.customerservice.config.CustomerConfigPrams;
import net.ouabane.customerservice.entities.Customer;
import net.ouabane.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigPrams.class)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args ->{
			customerRepository.save(Customer.builder().name("OUABANE").email("Ouabaneayoubb@gmail.com").build());
			customerRepository.save(Customer.builder().name("Ayoub").email("Ayoubb@gmail.com").build());
			customerRepository.save(Customer.builder().name("Ali").email("Ali@gmail.com").build());
			customerRepository.findAll().forEach(c->{
				System.out.println("************************************");
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getEmail());
				System.out.println("*************************************");
			});
		};
	}
}
