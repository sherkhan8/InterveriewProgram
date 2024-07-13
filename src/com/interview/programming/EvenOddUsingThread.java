package com.interview.programming;

import java.util.Scanner;

public class EvenOddUsingThread implements Runnable {

	//public static void printNum(int num) {
	int rem;
	static int n = 1;
	
	
	static int num_upto = 20;
	static Object lock = new Object();

	EvenOddUsingThread(int rem) {
		this.rem = rem;
	}

	public void run() {
		while (n < num_upto) {
			synchronized (lock) {
				while (n % 2 != rem) {
					try {
						lock.wait();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "=" + n);
				n++;
				lock.notifyAll();
			}

		}

	}
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		//printNum(num);
		EvenOddUsingThread oddNum = new EvenOddUsingThread(1);
		EvenOddUsingThread evenNum = new EvenOddUsingThread(0);

		Thread t1 = new Thread(oddNum, "Odd");
		Thread t2 = new Thread(evenNum, "Even");

		t1.start();
		t2.start();

	}

}
