package com.test03;

import org.springframework.stereotype.Component;
//<bean id="lgTV" class="com.test03.lgTV"/>
@Component
public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("lgtv power on");

	}

	@Override
	public void powerOff() {
		System.out.println("lgtv power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("lgtv volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("lgtv volume down");

	}

}
