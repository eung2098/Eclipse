package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

	/*	int inum = 255;
		byte bnum = (byte) inum;
		
		System.out.println(bnum);
		
		double dnum = 3.14;
		int iNum = (int)dnum;
		
		System.out.println(iNum);
		
		*/
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum = (int)dNum + (int)fNum;
		int iNum2 = (int) (dNum + fNum);
		
		System.out.println(iNum);
		System.out.println(iNum2);
	}

}
