package basicpractice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int N = sc.nextInt();
		while (N-- > 0) {
			int x = sc.nextInt();
			if (x == 0) {
				if(q.isEmpty()) {
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
