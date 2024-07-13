package com.hcl;

public class printUniqueChar {

	public static void main(String[] args) {
		String s = "AABBABABABBAHHHSSS"; //ABHS
		char[] a = s.toCharArray();

		//int a[] = { 1, 2, 3, 3, 6, 7, 8, 9, 10 };
		int k = a.length;
		for (int i = 0; i < k ; i++) {
			for (int j = 0; j < k; j++) {
				if (a[j] == a[j+1]) {
				break;
				}
				else if(a[j]!=a[j+1]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
