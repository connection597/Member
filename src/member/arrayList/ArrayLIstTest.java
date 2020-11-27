package member.arrayList;

import member.Member;

public class ArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPrak = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPrak);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
