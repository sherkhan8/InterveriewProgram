package com.eka.software;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArrays {
	
	public void Merge2SortedArrays(int[] fstarrays,int[] sdnarrays,int[] trdarrays, int n1, int n2) {
		int a=0,b=0,c=0;
		while(a< n1 && b<n2) {
			if(fstarrays[a]< sdnarrays[b]) {
				trdarrays[c++]=fstarrays[a++];
			}
			else
				trdarrays[c++]=sdnarrays[b++];
		}
		while(a< n1) {
			trdarrays[c++]=fstarrays[a++];
		}
		while(b< n2) {
			trdarrays[c++]=sdnarrays[b++];
		}
	}

	public static void main(String[] args) {
		Merge2SortedArrays M=new Merge2SortedArrays();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter 1st arrays Size: ");
		int fst=sc.nextInt();
		System.out.print("Enter 2nd arrays Size: ");
		int snd=sc.nextInt();
		int trd=fst+snd;
		
		int[] fstarrays=new int[fst];
		int[] sdnarrays=new int[snd];
		int[] trdarrays=new int[trd];
		int n1=fstarrays.length;
		int n2=sdnarrays.length;
		int n3=trdarrays.length;
		System.out.println("Please enter First arrays elements");
		for (int i = 0; i < n1; i++) {
			fstarrays[i]=sc.nextInt();
		}
		Arrays.sort(fstarrays);
		System.out.println("After Sorting 1st Arrays");
		
		for (int k = 0; k < n1; k++) {
			System.out.print(fstarrays[k]+" ");
		}
		System.out.println();
		System.out.println("Please enter Second arrays elements");
		for (int j = 0; j < n2; j++) {
			sdnarrays[j]=sc.nextInt();
		}
		Arrays.sort(sdnarrays);
		System.out.println("After Sorting 2nd Arrays");
		for (int k = 0; k < n2; k++) {
			System.out.print(sdnarrays[k]+" ");
		}
		System.out.println();
		M.Merge2SortedArrays(fstarrays,sdnarrays,trdarrays,n1,n2);
		
		System.out.println("After Merge 2 Sorting Arrays");
		for (int k = 0; k < n3; k++) {
			System.out.print(trdarrays[k]+" ");
		}
	}

}
