package ch01;

public class Order {
	String orderId;
	String bayerId;
	String sellerId;
	String orderDate;
	int expense;

	public void showOrderInfo() {
		System.out.println(bayerId + "���� �ֹ��Ͻ� ��ǰ��" + orderId + "�̰� �ֹ� ��¥��" + orderDate + "�̸� ��ǰ�� ������" + expense + "�Դϴ�." + "�Ǹ��� :" + sellerId);
	}
}
