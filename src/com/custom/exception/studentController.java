package com.custom.exception;

import java.util.Scanner;

public class studentController extends RuntimeException {
	
	studentController(){}
	
	public studentController(String msg){
		super(msg);
	}
	 public Student find(String studentID) throws studentController {
	        if (studentID.equals("123")) {
	            return new Student();
	        } else {
	            throw new studentController("Could not find student with ID " + studentID);
	        }
	    }

	public static void main(String[] args) {
		studentController manager = new studentController();
		while(true){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter Student ID: ");
		 String id=sc.nextLine();
        try {

           Student student = manager.find(id);
 
        } catch (studentController ex) {
            System.err.print(ex);
        }
        System.exit(0);
    }
		
	}
}
