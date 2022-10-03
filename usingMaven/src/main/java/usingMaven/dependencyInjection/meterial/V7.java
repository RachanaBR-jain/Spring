package usingMaven.dependencyInjection.meterial;

import org.springframework.stereotype.Component;

import usingMaven.dependencyInjection.interfaces.Engine;
@Component("V7Engine")
public class V7 implements Engine{

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "V7 engine";
	}
	

}
