package ch21;


public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("난중일기1", "이순신");
		library[1] = new Book("난중일기2", "이순신");
		library[2] = new Book("난중일기3", "이순신");
		library[3] = new Book("난중일기4", "이순신");
		library[4] = new Book("난중일기5", "이순신");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		
		library[0].setAuthor("전은구");
		library[0].setTitle("나무");
				
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copylibrary ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}

	}
}
