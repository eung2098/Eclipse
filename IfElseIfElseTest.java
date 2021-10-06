package ch15;

public class IfElseIfElseTest {

	public static void main(String[] args) {

		int age = 7;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입나다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 300000;
			System.out.println("못생겼습니다.");
		}
		
		System.out.println("입장료는" + charge + "입니다");
	}

}
