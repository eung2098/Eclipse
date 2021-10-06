package ch04;

public class Student {
	
	int studentId;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentId + "학번 학생 이름은" + studentName + "이고, 주소는" + address + "입니다.");
		
	}
	
//	public void setStudentName(String name) {
//		studentName = name;
//	}
}
