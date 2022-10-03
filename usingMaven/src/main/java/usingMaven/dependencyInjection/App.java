package usingMaven.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import usingMaven.dependencyInjection.interfaces.Car;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("audi", Car.class);
		System.out.println(myCar.vendor());
		context.close();
	}
}
