package ch03;

@FunctionalInterface  //(함수형 인터페이스) method 2개 선언 불가
public interface Add {
	
	public int add(int x, int y);
	//public int sub(int x, int y);
}
