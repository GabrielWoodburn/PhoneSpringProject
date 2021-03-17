package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Manufacturer;
import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class PhoneProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PhoneProjectApplication.class, args);
	
	}
	
	@Autowired
	PhoneRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Phone p = appContext.getBean("phone", Phone.class);
		p.setColor("Light Grey");
		repo.save(p);
		
		Phone x = new Phone("IPhone X", 8, 1499.99, "White");
		Manufacturer m = new Manufacturer("Apple", "USA", "From a garage to an empire");
		x.setManufacturer(m);
		repo.save(x);
		
		List<Phone> allPhones = repo.findAll();
		for(Phone phone: allPhones) {
			System.out.println(phone.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	
	}

}