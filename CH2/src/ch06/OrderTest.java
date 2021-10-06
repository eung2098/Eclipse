package ch06;

public class OrderTest {

	public static void main(String[] args) {

		OrderNumber o1 = new OrderNumber("202108292024", "010-4059-2098", "충주시 교현동", 210829, 2024, 15000, 11);
		System.out.println(o1.showOrderInfo());
	}

}
