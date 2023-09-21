package kr.co.himedia.arraylist;

import java.util.ArrayList;

public class Student {

	//선언만 했다.
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	//생성한다
	public Student(int studentId, String studentName ) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	
//	Subject korea;   
//	Subject math;
//	Subject english;
}
