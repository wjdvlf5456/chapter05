package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("/Users/choijungphil/javaStudy/file/img.jpg");
		OutputStream out = new FileOutputStream("/Users/choijungphil/javaStudy/file/byteImg.jpg");

		System.out.println("복사시작");

		while (true) {
			int data = in.read();

			System.out.println("복사끝" + data);
			if (data == -1) {
				break;
			}

			out.write(data);

		}

		out.close();
		in.close();
	}

}
