package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 50);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
