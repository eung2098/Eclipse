package ch01;

public class Order {
	String orderId;
	String bayerId;
	String sellerId;
	String orderDate;
	int expense;

	public void showOrderInfo() {
		System.out.println(bayerId + "님이 주문하신 상품은" + orderId + "이고 주문 날짜는" + orderDate + "이며 상품의 가격은" + expense + "입니다." + "판매자 :" + sellerId);
	}
}
