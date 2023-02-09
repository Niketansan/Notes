package com.pratice;

import java.io.FileInputStream;

public class FileOutExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fInput =null;
		try {
			 fInput = new FileInputStream("C:\\\\ProjectSynchron\\\\Hackerthon2023\\\\test.txt");

			int i;
			while ((i = fInput.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			fInput.close();
		}
		
	}
}
