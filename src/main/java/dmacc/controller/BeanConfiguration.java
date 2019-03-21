package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.House;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House();
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address();
		return bean;
	}

}
