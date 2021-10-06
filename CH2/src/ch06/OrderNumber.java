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
		return "�ֹ���ȣ : " + orderNumber + " �ֹ��� �ڵ�����ȣ : " + bayerPhoneNumber + " �ֹ��� �ּ� : " + bayerAddress + " �ֹ� ��¥ : " + orderDate + " �ֹ� �ð� : " + orderTime + " �ֹ����� : " + orderValue + " �޴� ��ȣ : " + foodNumber;
	}
}
