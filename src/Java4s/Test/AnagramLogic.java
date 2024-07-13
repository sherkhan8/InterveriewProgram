package Java4s.Test;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please Enter Name:");
			String a = sc.nextLine();
			// ali
			char[] ch = a.toLowerCase().toCharArray();
			System.out.print("Please Enter Name:");
			String b = sc.nextLine();
			// ila
			char[] ch2 = b.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);
			if (a.length() == b.length()) {
				if (Arrays.equals(ch, ch2)) {
					System.out.println("Name1: " + a + ", & Name2: " + b + " are Anagram");
				} else {
					System.out.println("Name1: " + a + ", & Name2: " + b + " are not Anagram");
				}
			} else {
				System.out.println("\nStrings are not Anagram");
			}

		}
	}
}
