package ch14;

public class TaxiTest {

	public static void main(String[] args) {

		Customer customerJ = new Customer("Jeon", 17000);
		
		Taxi taxi = new Taxi("Àß °£´Ù");
		
		customerJ.takeTaxi(taxi);
		
		customerJ.showInfo();
		
		taxi.showTaxiInfo();
		
	}

}
