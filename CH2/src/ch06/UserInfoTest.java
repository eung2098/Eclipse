package ch06;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo user1 = new UserInfo();
		user1.userAddress = "충주시 교현동";
		user1.userId = "wjsrn135";
		user1.userName = "전은구";
		user1.userPassWord = "12345";
		user1.userPhoneNumber = "010-4059-2098";
		
		System.out.println(user1.showUserInfo());
		
		UserInfo user2 = new UserInfo("wjsrn135", "전은구", "12345", "충주시 교현동", "010-4059-2098"); 
			System.out.println(user2.showUserInfo());
		
	}

}
