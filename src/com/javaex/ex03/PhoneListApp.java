package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneListApp {

	public static void main(String[] args) throws IOException {

		List<Person> pList = new ArrayList<Person>();
		Reader fr = new FileReader("/Users/choijungphil/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			String[] info = str.split(",");
			Person p = new Person(info[0], info[1], info[2]);
			p.showInfo();

		}

		br.close();

	}

}
