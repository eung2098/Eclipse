package ch13;

public class MemberTreeSetTest {

	public static void main(String[] args) {

//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("김유신");
//		
//		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberKim = new Member(1001, "김유신");
		Member memberLee = new Member(1002, "이순신");
		Member memberJ = new Member(1003, "전은구");
		Member memberHong = new Member(1004, "홍길동");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberJ);
		
		memberTreeSet.showAllMember();
		
//		Member memberE = new Member(1003, "율곡 이이");
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
