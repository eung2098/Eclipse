package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberKim = new Member(1001, "������");
		Member memberLee = new Member(1002, "�̼���");
		Member memberJ = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberJ);
		
		memberHashSet.showAllMember();
		
		Member memberE = new Member(1003, "���� ����");
		memberHashSet.addMember(memberE);
		
		memberHashSet.showAllMember();
		memberHashSet.removeMember(memberJ.getMemberId());
		
		memberHashSet.showAllMember();
//		memberArrayList.removeMember(1002);
//		
//		memberArrayList.showAllMember();
	}

}
