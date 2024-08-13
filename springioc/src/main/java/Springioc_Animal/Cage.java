package Springioc_Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	@Autowired
	private Animal animal;
	void cageanimal(){
		animal.sound();
	}

}
