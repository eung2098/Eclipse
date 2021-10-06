package ch06;

public class BayerInfo {

	public String bayerName;
	public int bayerStature;
	public int bayerWeight;
	public int bayerAge;
	
	public BayerInfo(String bayerName, int bayerStature, int bayerWeight, int bayerAge) {
		this.bayerName = bayerName;
		this.bayerStature = bayerStature;
		this.bayerWeight = bayerWeight;
		this.bayerAge = bayerAge;
	}

	public String showBayerInfo() {
		return bayerName + "의 키는" + bayerStature + "cm이고 몸무게는" + bayerWeight + "kg이며 나이는" + bayerAge + "세 입니다.";
	}
}
