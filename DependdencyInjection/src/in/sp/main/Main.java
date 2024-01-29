package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config_file_loc="in/sp/resourcess/applicationContext.xml";
     ApplicationContext context= new ClassPathXmlApplicationContext(config_file_loc);
     Student std=(Student) context.getBean("stu123");
     std.display();
	}

}
