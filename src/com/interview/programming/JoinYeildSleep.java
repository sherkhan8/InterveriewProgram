package com.interview.programming;

public class JoinYeildSleep implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Child Ali");
			try {
				Thread.sleep(4000);

			} catch (Exception ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		JoinYeildSleep jys = new JoinYeildSleep();
		Thread t = new Thread(jys);
		t.start();
		//t.join();
		t.yield();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Parent Ali");
		}

	}

}
