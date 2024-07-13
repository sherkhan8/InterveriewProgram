package com.custom.exception;

public class invalidInputException extends RuntimeException {

	public invalidInputException() {
		super();
	}

	public invalidInputException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		try {

			throw new invalidInputException();
		} catch (Exception e) {
			System.out.println("Please select correct number: ");
			System.out.println(e.getMessage());
		}

		try {

			throw new invalidInputException("You are passing wrong number: ");
		} catch (ArithmeticException ae) {
			System.out.println("Please select definite correct number: ");
			System.out.println(ae.getMessage());
		}
	}
}
