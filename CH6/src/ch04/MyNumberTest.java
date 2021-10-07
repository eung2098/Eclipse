package ch04;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNum = (x, y)->( x > y)? x: y;
		
		System.out.println(myNum.getMax(10, 15));
	}

}
