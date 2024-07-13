package com.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class OccuranceFile {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("D:/SpringBootStuff/file/input.txt"));
		File fileTwo = new File("D:/SpringBootStuff/file/output.txt");
		FileOutputStream fos = new FileOutputStream(fileTwo);
		PrintWriter pw = new PrintWriter(fos);
		String st;
		String op = "";
		while ((st = reader.readLine()) != null) {
			op += st;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = op.toCharArray();
		for (char k : ch) {
			if (map.containsKey(k)) {
			map.put(k, map.get(k) + 1);
			} else
			map.put(k, 1);
			}
		pw.println(op);
		pw.println(map);
		System.out.println(map);
		pw.flush();
		pw.close();
		fos.close();
		System.out.println("Writing successful");
		// close the file
		fos.close();
	}
}
