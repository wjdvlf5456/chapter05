package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneListApp {

	public static void main(String[] args) throws IOException {

		List<Person> pList = new ArrayList<Person>();
		Reader fr = new FileReader("/Users/choijungphil/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		Writer fw = new FileWriter("/Users/choijungphil/javaStudy/file/PhoneDB_복사본.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();

			String[] info = str.split(",");
			Person p = new Person(info[0], info[1], info[2]);

			pList.add(p);

		}

		for (Person i : pList) {
			i.showInfo();
		}

		bw.close();
		br.close();

	}

}
