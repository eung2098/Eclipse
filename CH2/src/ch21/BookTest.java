package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("�����ϱ�1", "�̼���");
		library[1] = new Book("�����ϱ�2", "�̼���");
		library[2] = new Book("�����ϱ�3", "�̼���");
		library[3] = new Book("�����ϱ�4", "�̼���");
		library[4] = new Book("�����ϱ�5", "�̼���");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
