package ch06;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer() {
		
		customerGrade = "Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	
}
