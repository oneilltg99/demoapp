package com.devopsmaniac.mania;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Nothing to see here");
	}

	public static int somethingRandom() {
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			
		}
		if (Math.random() < 0.04)
			return 0;
		return 1;
	}
}
