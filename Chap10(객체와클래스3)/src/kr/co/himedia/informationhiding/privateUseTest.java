package kr.co.himedia.informationhiding;

class Student1{
	String name;
	int age;
}

class Student2{
	public String name;
	private int age;
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age; 		//값을 확인한다
	}
	
	public void setAge(int age) {
		//유효성 검사
		if(age < 0 || age > 150) {
			System.out.println("나이가 부적합합니다.");
			return; 
		}
		this.age = age;
	}
}



public class privateUseTest {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1();
		student1.name = "이순신";   //멤버변수에 직접접근
		student1.age = -20;		  //멤버변수에 직접접근
		
		System.out.printf("%s의 나이는 %d살입니다.\n", student1.name, student1.age);
		
		Student2 student2 = new Student2("신사임당", 20);
		student2.name = "이방원";   //멤버변수에 직접 접근
		student2.setAge(-10);	  //세터를 사용한 접근
		
		System.out.printf("%s의 나이는 %d살입니다.", student2.name, student2.getAge());
		
	}
}
