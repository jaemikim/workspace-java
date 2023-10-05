package kr.co.himedia.object;

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("himedia");
		String str2 = new String("himedia");

		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2);
	}
}
