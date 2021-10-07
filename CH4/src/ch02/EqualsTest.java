package ch02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2); // 실제 주소가 다름 false
		System.out.println(std1.equals(std2)); // 논리적으로 같은 값
		
		System.out.println(std1.hashCode()); // 논리적으로 같으므로 같은 hashCode 값
		System.out.println(std2.hashCode()); // 논리적으로 같으므로 같은 hashCode 값
		
		System.out.println(System.identityHashCode(std1)); // 실제 가지고 있는 가상메로리 값
		System.out.println(System.identityHashCode(std2)); // 실제 가지고 있는 가상메로리 값
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
	}
}
