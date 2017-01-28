package basicpractice;
import java.util.*;

public class bj_11279 {
	static class Compare implements Comparator<Integer> {
		public int compare(Integer one, Integer two) {
			return two.compareTo(one); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare cmp = new Compare();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(1, cmp);
		int N = sc.nextInt();
		
		while (N-- > 0) {
			int x = sc.nextInt();
			if (x == 0) {
				if (q.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(q.poll());
				}
			} else {
				q.offer(x);
			}
		}
	}
}
