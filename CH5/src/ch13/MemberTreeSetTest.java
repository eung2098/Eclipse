package ch13;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("������");
//		
//		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberKim = new Member(1001, "������");
		Member memberLee = new Member(1002, "�̼���");
		Member memberJ = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberJ);
		
		memberTreeSet.showAllMember();
		
//		Member memberE = new Member(1003, "���� ����");
//		memberTreeSet.addMember(memberE);
		
//		memberTreeSet.showAllMember();
//		memberTreeSet.removeMember(memberJ.getMemberId());
//		
//		memberTreeSet.showAllMember();
//		memberArrayList.removeMember(1002);
//		
//		memberArrayList.showAllMember();
	}

}
