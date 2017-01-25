package basicpractice;
import java.util.*;

public class bj_10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			String[] line = sc.nextLine().split(" ");
			String cmd = line[0];
			if (cmd.equals("push")) {
				int num = Integer.valueOf(line[1]);
				queue.offer(num);
			} else if (cmd.equals("pop")) {
				if(queue.isEmpty() == true)
					System.out.println("-1");
				else
					System.out.println(queue.poll());
			} else if (cmd.equals("size")) {
				System.out.println(queue.size());
			} else if (cmd.equals("empty")) {
				if(queue.isEmpty() == true)
					System.out.println("1");
				else
					System.out.println("0");
			} else if (cmd.equals("front")) {
				if(queue.isEmpty() == true)
					System.out.println("-1");
				else
					System.out.println(queue.peek());
			} else if (cmd.equals("back")) {
				if(queue.isEmpty() == true)
					System.out.println("-1");
				else {
					//queue.
				}
			}
		}
	}
}
