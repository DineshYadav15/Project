package com.resourcess;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.product.ProductRepository;
import com.product.ProductService;
@Configuration
public class Stringconfigfile {
	
		@Bean
		public ProductRepository ProductServiceobj() {
			ProductRepository s1 = new ProductRepository();
			s1.setId(121);
			s1.setName("box");
			s1.setPrice(123.12);
			return s1;
		}
		@Bean
		public ProductService productServiceobj()
		{
			ProductService s2=new ProductService();
			//s2.setProductrepository( ProductServiceobj());
			return s2;
			
		}

	

}
