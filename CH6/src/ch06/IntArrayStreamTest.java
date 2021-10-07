package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for( int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n)); //stream 한번 사용 후 재사용시 stream 재생성
		
		System.out.println();
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}							

}
