package usingMaven.dependencyInjection.Cars;

import org.springframework.stereotype.Component;

import usingMaven.dependencyInjection.interfaces.Car;

public class Audi implements Car {

	@Override
	public String vendor() {
		// TODO Auto-generated method stub
		return "Audi A4 from Audi";
	}

}
