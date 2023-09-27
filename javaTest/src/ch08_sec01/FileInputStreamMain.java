package ch08_sec01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileInputStreamMain {

	public static void main(String[] args) {
		try {
//			FileReader fr = new FileReader("C:\\javaTest10\\javaTest.txt");
			FileInputStream fr = new FileInputStream("C:\\javaTest10\\javaTest.txt");
			InputStreamReader isr = new InputStreamReader(fr);
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
