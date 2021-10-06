package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("난중일기1", "이순신"));
		library.add(new Book("난중일기2", "이순신"));
		library.add(new Book("난중일기3", "이순신"));
		library.add(new Book("난중일기4", "이순신"));
		library.add(new Book("난중일기5", "이순신"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
