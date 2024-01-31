package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.ProductService;
import com.resourcess.Stringconfigfile;


public class Main {
	public static void main(String[] arg) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Stringconfigfile.class);
		ProductService s3=context.getBean(ProductService.class);
		s3.display();
		
	}

}
