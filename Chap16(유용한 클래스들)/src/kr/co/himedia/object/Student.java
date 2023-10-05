package kr.co.himedia.object;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
//		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
