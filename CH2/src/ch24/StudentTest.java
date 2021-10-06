package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("����", 80);
		studentLee.addSubject("����", 90);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 60);
		studentKim.addSubject("����", 50);
		
		studentLee.showScoreInfo();
		System.out.println("=======");
		studentKim.showScoreInfo();
	}

}
