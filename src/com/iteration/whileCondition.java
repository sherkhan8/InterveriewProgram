package com.iteration;

public class whileCondition {

	private int a=10;
	private int b;
	whileCondition(){
		System.out.println("###################Pyramid Design###################");
	}
	whileCondition(int sum){
		System.out.println(a+b);
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
	}
	
	/*void whileCondition(int k){
		while(k<=10){
			System.out.println(k);
			k++;
		}
	}*/
	void doWhileCondition(int b){
		do{
			System.out.println(b);
			b++;
		}
		while(b<10);
	}
	/*void forCondition(int b){
		for (int i = b; i > 0; --i) {
			for (int j = i; j > 0; --j) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}*/
	
	void forCondition(int b){
		for(int i=0;i<b;i++) {
	         for(int j=0;j<b-i;j++) {
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("*");
	        }
	        System.out.println();  
	    }
	}
	

	public static void main(String[] args) {
		whileCondition wc=new whileCondition();
		//wc.whileCondition(5);
		//wc.doWhileCondition(2);
		wc.forCondition(10);

	}

}
