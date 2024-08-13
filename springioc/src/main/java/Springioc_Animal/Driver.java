package Springioc_Animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Config1.class);
		Cage c=context.getBean(Cage.class);
		System.out.println(c);

	}

}
