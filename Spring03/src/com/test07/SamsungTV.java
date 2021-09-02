package com.test07;

public class SamsungTV implements TV {

	
	public SamsungTV() {
		System.out.println("samsung tv 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("samsung TV power on");

	}

	@Override
	public void powerOff() {
		System.out.println("samsung TV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("samsung TV volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("samsung TV volume down");

	}

}
