package member.hashset;
import java .util.HashSet;
import java.util.Iterator;

import member.Member;

public class MemeberHashsetTset {
	private HashSet<Member> hashSet;
	
	public void MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int templd = member.getMemberId();
			if(templd == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId +"가 존재 하지 않습니다");
		return false;
	}
	public void showAllMemeber() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
