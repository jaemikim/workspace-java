package kr.co.himedia.goingtoacademy;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("김채은", 5, 10000);
//		student1.name = "김채은";
//		student1.grade = 5;
//		student1.money = 10000;
		
		Student student2 = new Student("서승덕", 5, 50000);
//		student2.name = "서승덕";
//		student2.grade = 6;
//		student2.money = 50000;
		
		System.out.println(student1);
		System.out.println(student2);
	
//		int a = (student2.money) -;		
//		System.out.println(a);
		
		Bus bus = new Bus(3325);
		System.out.println(bus);
		
		Subway subway = new Subway(5);
		System.out.println(subway);
		
		student1.busTake();
		
		
		
//		int sum = (student1.money) - (subway.subwayIncom);		
//		System.out.println(sum);

		
	}
	
}
