package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("난중일기1", "이순신");
		library[1] = new Book("난중일기2", "이순신");
		library[2] = new Book("난중일기3", "이순신");
		library[3] = new Book("난중일기4", "이순신");
		library[4] = new Book("난중일기5", "이순신");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
