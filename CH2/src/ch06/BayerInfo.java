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
		return bayerName + "�� Ű��" + bayerStature + "cm�̰� �����Դ�" + bayerWeight + "kg�̸� ���̴�" + bayerAge + "�� �Դϴ�.";
	}
}
