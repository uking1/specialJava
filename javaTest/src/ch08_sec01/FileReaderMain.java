package ch08_sec01;

import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\javaTest10\\javaTestWrite.txt");
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
