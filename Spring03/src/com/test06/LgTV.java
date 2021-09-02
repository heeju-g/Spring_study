package com.test06;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LG TV power on");

	}

	@Override
	public void powerDown() {
		System.out.println("LG TV power down");

	}

	@Override
	public void volumeOn() {
		System.out.println("LG TV volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV volume down");

	}

}
