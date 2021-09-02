package com.test07;

public class LgTV implements TV {

	public LgTV() {
		System.out.println("LGTV 생성");
	}
	
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
