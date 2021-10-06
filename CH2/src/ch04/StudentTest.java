package ch04;

public class StudentTest {

	public static void main(String[] args) {

//		Student studentLee = new Student();
//		
//		studentLee.studentId = 12345;
//		studentLee.setStudentName("Lee");
//		studentLee.address = "서울 강남구";
//		
//		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 21314;
		studentKim.studentName = " Kim";
		studentKim.address = " 충주시 교현동";
		
		studentKim.showStudentInfo();
		
		Student studentJeon = new Student();
		
		studentJeon.studentName = "Jeon";
		studentJeon.studentId = 14213;
		studentJeon.address = "충주시 교현동";
		
		studentJeon.showStudentInfo();
		
			}

}
