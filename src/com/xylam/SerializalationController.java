package com.xylam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializalationController {

	public static void main(String[] args) throws Exception{
		/*
		 * SerlizationDemo sd=new SerlizationDemo(101, "sherkhan", "sher786");
		 * 
		 * FileOutputStream fos=new FileOutputStream("File.txt"); ObjectOutputStream
		 * oos=new ObjectOutputStream(fos);
		 * 
		 * oos.writeObject(sd);
		 * 
		 * FileInputStream fis=new FileInputStream("File.txt"); ObjectInputStream
		 * ois=new ObjectInputStream(fis); SerlizationDemo
		 * sd1=(SerlizationDemo)ois.readObject();
		 * System.out.println("ID: "+sd1.getId()+", User: "+sd1.getUsername()+
		 * ", Password: "+sd1.getPassword());
		 */
		
		
		CustomizationDemo sd=new CustomizationDemo(101, "sherkhan", "sher786");
		
		FileOutputStream fos=new FileOutputStream("File.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(sd);
		
		FileInputStream fis=new FileInputStream("File.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		CustomizationDemo sd1=(CustomizationDemo)ois.readObject();
		System.out.println("ID: "+sd1.getId()+", User: "+sd1.getUsername()+ ", Password: "+sd1.getPassword());

	}

}
