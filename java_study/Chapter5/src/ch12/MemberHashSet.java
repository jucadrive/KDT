package ch12;



import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;	// ArrayList 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<>();	// Member로 선언한 ArrayList 생성
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {	// ArrayList에 멤버 추가
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {	// 멤버 id를 매개변수로, 삭제여부 반환
//		for(int i = 0; i < arrayList.size(); i++) {		// 해당 id를 가진 멤버를 ArrayList에서 찾음
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {	// 멤버 id가 매개변수와 일치하면
//				arrayList.remove(i);	// 해당 멤버 삭제
//				return true;	// true 반환
//			}
//		}
//		System.out.println(memberId + "가 존재하지 않는다.");	// for문이 끝날 때까지 return이 안 된 경우
//		return false;
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet ) {
			System.out.println(member);
		}
		System.out.println();
	}
}
