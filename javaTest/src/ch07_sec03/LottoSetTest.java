package ch07_sec03;

import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();

		for (; true;) {
			int no = (int) (Math.random() * (45 - 1 + 1) + (1));
			hset.add(no);
			if (hset.size() >= 6)
				break;
		}
		for(Integer data : hset) {
			System.out.printf("%4d ",data);
		}
		System.out.println("\n===============================");
		Iterator<Integer> ir = hset.iterator();
		
		while(ir.hasNext()) {
			int data = ir.next();
			System.out.printf("%4d ",data);
		}
		
	}

}
