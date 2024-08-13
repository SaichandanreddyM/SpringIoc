package springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		         Partial xml and class
//		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
//		Laptop laptop=context.getBean(Laptop.class);
//		System.out.println(laptop);   
		
//		
//		Student student=context.getBean(Student.class);
//		System.out.println(student);
		
		
//		             Using Full Class 
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student stu=context.getBean(Student.class);
		System.out.println(stu);

	}

}
