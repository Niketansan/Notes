package com.pratice;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataOutputStreamExample {
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("C:\\\\Projects\\\\Synchron\\\\Hackerthon2023\\\\test.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeBytes("hello world");
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("Succcess...");
	}
}
