package usingMaven.dependencyInjection.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import usingMaven.dependencyInjection.interfaces.Car;
import usingMaven.dependencyInjection.interfaces.Engine;

public class Benz implements Car {
	@Autowired()
	@Qualifier("V6Engine")
	Engine engine;
	

	@Override
	public String vendor() {
		// TODO Auto-generated method stub

		return "Mercedes-Benz  from Benz with Engine type " + engine.type();
	}

}
