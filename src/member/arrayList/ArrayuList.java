package member.arrayList;

import java.util.ArrayList;

import member.Member;

public class ArrayuList {
	private ArrayList<Member> arrayList;
	
	public void MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i =0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int templd = member.getMemberId();
			if(templd == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId +"가 존재하지 않습니다");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
