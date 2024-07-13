package com.xylam;

public class appendString {

	public static void main(String[] args) {
		String s = "SherKhan";
		String s2 = "AliKhan";

		StringBuilder sb = new StringBuilder();

		int l = s.length();
		int l2 = s2.length();
		int i = 0, j = 0;
		if (i < l && j < l2) {
			sb.append(s.charAt(i++));
			sb.append(s2.charAt(j++));
		}
		if (i != l) {
			sb.append(s.substring(i));
		}
		if (j != l2) {
			sb.append(s2.substring(j));
		}
		System.out.println(sb.toString());
	}

}
