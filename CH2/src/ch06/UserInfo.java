package ch06;

public class UserInfo {

	public String userId;
	public String userName;
	public String userPassWord;
	public String userAddress;
	public String userPhoneNumber;
	
	public UserInfo() {} //default constructor 외부에서 정보제공시 문제가 될 가능성이 있으면 제공하지 않음
	
	public UserInfo(String userId, String userName, String userPassWord, String userAddress, String userPhoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.userPassWord = userPassWord;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
	}
	
	public String showUserInfo() {
		return userName + "님의 아이디는" + userId + "이고 비밀번호는" + userPassWord + "이며 주소와 전화번호는" + userAddress + userPhoneNumber + "입니다.";
	}
}
