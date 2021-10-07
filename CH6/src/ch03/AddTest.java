package ch03;

public class AddTest {

	public static void main(String[] args) {

		Add add1 = (x,y)-> x*y; // === {return x*y;};
		
		System.out.println(add1.add(3, 5));
	}

}
