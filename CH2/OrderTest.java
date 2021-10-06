package ch01;

public class OrderTest {

	public static void main(String[] args) {

		Order order1 = new Order();
		order1.bayerId = "wjsrn135";
		order1.expense = 10000;
		order1.orderDate = "21.08.28";
		order1.orderId = "¾ÆÀÌÆù12pro";
		order1.sellerId = "dmdrk2098";
		
		order1.showOrderInfo();
		
	}

}
