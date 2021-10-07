package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer();
		customerT.setCustomerName("Tomas");
		customerT.setCustomerId(101);
		
		Customer customerJ = new Customer();
		customerJ.setCustomerName("James");
		customerJ.setCustomerId(102);
		
		Customer customerE = new GoldCustomer();
		customerE.setCustomerName("Edward");
		customerE.setCustomerId(103);
		
		Customer customerP = new GoldCustomer();
		customerP.setCustomerName("Percy");
		customerP.setCustomerId(104);
		
		Customer customerK = new VIPCustomer();
		customerK.setCustomerName("Kim");
		customerK.setCustomerId(105);
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===================");
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님의" + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
		
	}

}
