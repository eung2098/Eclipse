package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(1010);
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(1020);
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer();
		vc.setCustomerName("장보고");
		vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo() + price);
	}

}
