package ch06;

public class ThreeDPrintTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMateral(powder);
		
		Powder p = (Powder)printer.getMateral(); 
	}

}
