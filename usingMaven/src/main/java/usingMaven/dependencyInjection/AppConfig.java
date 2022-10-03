package usingMaven.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import usingMaven.dependencyInjection.Cars.Audi;
import usingMaven.dependencyInjection.Cars.Benz;
import usingMaven.dependencyInjection.meterial.V6;
import usingMaven.dependencyInjection.meterial.V7;

@Configuration
@ComponentScan("usingMaven.dependencyInjection")
public class AppConfig {
	
	@Bean("myBenz")
	public Benz benz() {
		return new Benz();	
	}
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
		
	}
	
	@Bean("V7Engine")
	public V7 v7() {
		return new V7();
		
	}
	@Bean("audi")
	public Audi audi() {
		return new Audi();	
	}

}
