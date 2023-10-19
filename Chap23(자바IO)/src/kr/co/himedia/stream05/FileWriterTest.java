package kr.co.himedia.stream05;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("write.txt")){
			fw.write('A');						 //문자 하나 출력
			
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);						 //문자 배열 출력
			
			fw.write(" 안녕하세요. 좋은 목요일입니다");  //String 출력
			
			fw.write(buf, 1, 2);                 // c, d가 출력
			
			fw.write("65");                      // "" 문자로 인식 그대로 65를 출력한다. 
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
