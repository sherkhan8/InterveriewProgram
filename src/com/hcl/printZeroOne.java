package com.hcl;

public class printZeroOne {

	public static void main(String[] args) {
		int[] a = { 1, 0, 1, 0, 0, 1, 0, 1, 1 };

		int rev;
		for (int j = 0; j < a.length; j++) {
			if (j % 2 == 0 || j == 0) {
					rev=0;
			}
			else {
				rev=1;
			}
			System.out.print(rev+",");
		}
	}

}
