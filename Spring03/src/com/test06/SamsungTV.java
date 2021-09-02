package com.test06;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("samsung tv power on");

	}

	@Override
	public void powerDown() {
		System.out.println("samsung tv power down");

	}

	@Override
	public void volumeOn() {
		System.out.println("samsung tv volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("samsung tv volume down");

	}

}
