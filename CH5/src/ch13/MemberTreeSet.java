package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> TreeSet;
	
	public MemberTreeSet() {
		TreeSet = new TreeSet<>();
	}
	
	public MemberTreeSet(int size) {
		TreeSet = new TreeSet<>();
	}
	
	public void addMember(Member member) {
		TreeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = TreeSet.iterator();
		
		while(ir.hasNext()) {
			
		
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if( tempId == memberId) {
				TreeSet.remove(member);
				return true;
			}
		
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		for( Member member : TreeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
