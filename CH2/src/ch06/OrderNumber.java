package ch06;

public class OrderNumber {
	public String orderNumber;
	public String bayerPhoneNumber;
	public String bayerAddress;
	public int orderDate;
	public int orderTime;
	public int orderValue;
	public int foodNumber;
	
	public OrderNumber(String orderNumber, String bayerPhoneNumber, String bayerAddress, int orderDate, int orderTime, int orderValue, int foodNumber) {
		this.orderNumber = orderNumber;
		this.bayerPhoneNumber = bayerPhoneNumber;
		this.bayerAddress = bayerAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderValue = orderValue;
		this.foodNumber = foodNumber;
	}
		
	public String showOrderInfo() {
		return "주문번호 : " + orderNumber + " 주문자 핸드폰번호 : " + bayerPhoneNumber + " 주문자 주소 : " + bayerAddress + " 주문 날짜 : " + orderDate + " 주문 시간 : " + orderTime + " 주문가격 : " + orderValue + " 메뉴 번호 : " + foodNumber;
	}
}
