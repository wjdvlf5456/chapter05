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
		// PhoneDB_원본이란 이름의 데이터값 불러오기
		Reader fr = new FileReader("/Users/choijungphil/javaStudy/file/PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		// PhoneDB_복사본란 이름의 메모장 경로에 추가
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
			// info[0] = 이름, info[1] = 휴대폰번호, info[2] = 회사번호
			Person p = new Person(info[0], info[1], info[2]);

			// 어레이리스트에 입력받은 값만큼 추가
			pList.add(p);

		}

		// 어레이리스트의 정보 Person에서 불러와 출력
		for (Person i : pList) {
			i.showInfo();
		}

		bw.close();
		br.close();

	}

}
