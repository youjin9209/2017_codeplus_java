package basicpractice;
import java.io.*;
import java.util.*;

public class bj_10828 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] st = line.split(" ");
			String cmd = st[0];
			
			if (cmd.equals("push")) {
				int item = Integer.valueOf(st[1]);
				stack.push(item);
			} else if (cmd.equals("pop")) {
				if(stack.empty() == true)
					System.out.println("-1");
				else
					System.out.println(stack.pop());
			} else if (cmd.equals("size")) {
				System.out.println(stack.size());
			} else if (cmd.equals("empty")) {
				if(stack.empty() == true)
					System.out.println("1");
				else
					System.out.println("0");
			} else if (cmd.equals("top")) {
				if(stack.empty() == true)
					System.out.println("-1");
				else
					System.out.println(stack.peek());
			}
			
		}
	}	
}
