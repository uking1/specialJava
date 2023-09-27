package ch08_sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream("C:/javaTest10/th.jpg");
		FileOutputStream fos = new FileOutputStream("C:/javaTest10/ths.jpg");
		
		while(true) {
			int data = fio.read();
			if(data == -1 ) {
				break;
			}
			fos.write(data);
			
		}
		System.out.println("복사 완료했습니다.");
		fio.close();
		fos.close();
		System.out.println("The end");
	}

}
