package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberKim = new Member(1001, "������");
		Member memberLee = new Member(1002, "�̼���");
		Member memberJ = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberJ);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberJ.getMemberId());
		
		memberArrayList.showAllMember();
//		memberArrayList.removeMember(1002);
//		
//		memberArrayList.showAllMember();
	}

}
