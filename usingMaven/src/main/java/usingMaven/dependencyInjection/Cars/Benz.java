package usingMaven.dependencyInjection.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import usingMaven.dependencyInjection.engine.Engine;
import usingMaven.dependencyInjection.interfaces.Car;

@Component
public class Benz implements Car {
	@Autowired()
	Engine engine;
	
	
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine";
		this.engine = engine;
	}
	
	public Benz(Engine engine) {
		engine.type = "new V9";
		this.engine = engine;
	}

	@Override
	public String vendor() {
		// TODO Auto-generated method stub

		return "Mercedes-Benz  from Benz with Eengine type " + engine.type;
	}

}
