package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("�����ϱ�1", "�̼���"));
		library.add(new Book("�����ϱ�2", "�̼���"));
		library.add(new Book("�����ϱ�3", "�̼���"));
		library.add(new Book("�����ϱ�4", "�̼���"));
		library.add(new Book("�����ϱ�5", "�̼���"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
