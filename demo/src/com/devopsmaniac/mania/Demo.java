package com.devopsmaniac.mania;


// comment

public class Demo {

	public static void main(String[] args) {
		System.out.println("Nothing to see here");
	}

	public static int somethingRandom() {
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			
		}
		if (Math.random() < 0.01)
			return 0;
		return 1;
	}
}
