package basicpractice;
import java.util.*;
import java.io.*;

public class bj_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		
		while (N > 0) {
			Stack<String> stack = new Stack<String>();
			String[] line = bf.readLine().split("");
			int i = 0;
			
			while (i < line.length) {
				if (line[i].equals("(")) {
					stack.push(line[i]);
					i++;
				}
				else {
					if (stack.empty() == true) {
						stack.push(line[i]);
						break;
					}
					else
						stack.pop();
					
					i++;
				}	
			}
			
			if (stack.empty() == true)
				System.out.println("YES");
			else if (stack.peek().equals(")"))
				System.out.println("NO");
			else
				System.out.println("NO");
			N--;
		}	
	}
}
