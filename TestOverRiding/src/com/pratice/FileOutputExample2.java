package com.pratice;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout1 = new FileOutputStream("C:\\\\Projects\\\\Synchron\\\\Hackerthon2023\\\\test.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\\\Projects\\\\Synchron\\\\Hackerthon2023\\\\test1.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		String s = "Thanks you1";
		System.out.println(s.length());

		bout.write(s.getBytes());

		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");
	}
}
