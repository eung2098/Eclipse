package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		sList.add("Home");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.println(s + "\t"));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n + "\t"));
		System.out.println();
		sList.stream().filter(s->s.length() >= 5 ).forEach(s->System.out.println(s));

	
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	
		int sum = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum);
	
	
	}

}
