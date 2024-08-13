package Springioc_Animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public interface Animal {
	void sound();

}
@Component
@Primary
class Dog implements Animal{

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Barking");
		
	}
	
}
@Component
class Cat implements Animal{

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping");
		
	}
	
}
