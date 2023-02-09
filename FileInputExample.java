package com.pratice;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout =null;
		try {
			 fout = new FileOutputStream("C:\\Projects\\Synchron\\Hackerthon2023\\test.txt");
			String s ="Thanks you1";
			System.out.println(s.length());
			
			fout.write(s.getBytes(),0,s.getBytes().length);
			
			System.out.println("success...");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}finally {
			
			fout.close();
		}
	}
}
