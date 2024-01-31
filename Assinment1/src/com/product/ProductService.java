package com.product;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
	@Autowired
	private ProductRepository productrepository;
	
	public ProductRepository getProductrepository() {
		return productrepository;
	}

	public void setProductrepository(ProductRepository productrepository) {
		this.productrepository = productrepository;
	}
      public void display()
      {
    	  System.out.println("ProductRepository : " + productrepository);
      }

	@Override
	public String toString() {
		return "ProductService [productrepository=" + productrepository + "]";
	}

	
}
