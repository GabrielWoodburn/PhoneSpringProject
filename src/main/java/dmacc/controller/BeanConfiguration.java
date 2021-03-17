package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Manufacturer;
import dmacc.beans.Phone;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Phone phone() {
		Phone bean = new Phone("Pixel 2");
		return bean;
	}

	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer("Google", "USA", "The one and only");
		return bean;
	}
}