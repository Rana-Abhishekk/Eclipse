package com.exception.functions;

import com.exception.custom.MyException;

public class HandleException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int x = 0;

		try {
			int y = 10 / x;
		} catch (Exception e) {
			System.out.println("You have hit a rough patch " + e);
			System.out.println(e.getStackTrace()); // it gives a stack tree element as well
			System.out.println(e.getMessage());

		} finally {
			System.out.println("This will be printed at any case");
		}
		System.out.println("without finally");

		// user defined exception
		int z = 7;
		try {
			if (z > 5) {
				throw new MyException("Problem");
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}