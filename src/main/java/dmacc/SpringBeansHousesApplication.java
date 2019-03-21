package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringBeansHousesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansHousesApplication.class, args);
	}
	
	@Autowired
	HouseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = new House("Frank", "Apartment", 2);
		Address a = new Address("123 South Blvd", "Ames", "Iowa");
		h.setAddress(a);
		repo.save(h);
		
		List<House> allHouses = repo.findAll();
		for (House houses : allHouses) {
			System.out.println(houses.toString());
		}
		
	}

}
