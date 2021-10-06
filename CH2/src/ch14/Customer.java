package ch14;

public class Customer {
	
	String customerName;
	int money;
	
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(5000);
		this.money -= 5000;
	}
	
	public void showInfo() {
		System.out.println(customerName + "´ÔÀÇ ÀÜ¾×Àº" + money + "¿ø ÀÔ´Ï´Ù.");
	}

}
