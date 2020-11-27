package member.hashset; //중복 허용하지 않은 hashset

import java.util.HashSet;

public class HashSat {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(new String("임정순"));
		hashset.add(new String("강호동"));
		hashset.add(new String("유정수"));
		hashset.add(new String("김미나"));
		hashset.add(new String("강호동"));
		
		System.out.println(hashset);

	}

}
