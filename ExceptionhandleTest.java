package com.pratice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionhandleTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		String s = null;
		try {

			System.out.println(s.length());

			int a = 10;
			int c = a / 0;

		} catch (NullPointerException e3) {
			e3.printStackTrace();

			System.out.println(e3.getMessage());

			System.out.println(e3.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("1231231");
		}

		try {
			System.out.println("1###############1");
		} finally {
			System.out.println("1231d2323");
		}
		System.out.println("###################");
		
		
		
		
		String path = "";

		try (FileReader fr = new FileReader(path);

				BufferedReader br = new BufferedReader(fr)

		) {
              
		} catch (Exception e) {

		}	
		
		
		
		
		
		
		
		

	
	}
}
