package kr.co.himedia.encapsulation;

/*
 * 메서드 조합으로 결과물을 생성 * 
 */
public class DisplayAddress {

	StringBuffer buffer = new StringBuffer();
	private String line = "=========================================\n";
	private String line2 = "----------------------------------------\n";
	private String title = "이름\t   주소\t\t    전화번호      \n";

	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append("이순신 \t");
		buffer.append("서울 강동구  \t");
		buffer.append("010-3331-1588\n");
		
		buffer.append("산사임당 \t");
		buffer.append("서울 송파구  \t");
		buffer.append("010-3331-2223\n");
	}
	
	private void makeFooter() {
		buffer.append(line2);
	}
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}
}
//toString() - 문자열이다