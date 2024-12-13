package net.ouabane.inventoryservice;

import net.ouabane.inventoryservice.entities.Product;
import net.ouabane.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args ->{
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("MAC").price(10000).quantity(1).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("LENOVO").price(9000).quantity(5).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("DELL").price(8000).quantity(3).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("LEGION").price(10000).quantity(4).build());
            productRepository.findAll().forEach(product->{
                System.out.println("************************************");
                System.out.println(product.toString());
                /*System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());*/
                System.out.println("*************************************");
            });
        };
    }
}
