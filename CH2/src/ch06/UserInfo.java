package ch06;

public class UserInfo {

	public String userId;
	public String userName;
	public String userPassWord;
	public String userAddress;
	public String userPhoneNumber;
	
	public UserInfo() {} //default constructor �ܺο��� ���������� ������ �� ���ɼ��� ������ �������� ����
	
	public UserInfo(String userId, String userName, String userPassWord, String userAddress, String userPhoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.userPassWord = userPassWord;
		this.userAddress = userAddress;
		this.userPhoneNumber = userPhoneNumber;
	}
	
	public String showUserInfo() {
		return userName + "���� ���̵��" + userId + "�̰� ��й�ȣ��" + userPassWord + "�̸� �ּҿ� ��ȭ��ȣ��" + userAddress + userPhoneNumber + "�Դϴ�.";
	}
}
