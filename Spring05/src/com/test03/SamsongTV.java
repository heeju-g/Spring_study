package com.test03;

import org.springframework.stereotype.Component;
//<bean id="samsong" class="com.test03.lgTV"/>
@Component("samsong")
public class SamsongTV implements TV {

	
	@Override
	public void powerOn() {
		System.out.println("samsongTV power on");

	}

	@Override
	public void powerOff() {
		System.out.println("samsongTV power off");

	}

	@Override
	public void volumeUp() {
		System.out.println("samsongTV volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("samsongTV volume down");

	}

}
