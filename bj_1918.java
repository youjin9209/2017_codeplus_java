package basicpractice;
import java.util.*;
import java.io.*;

public class bj_1918 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		String[] T = bf.readLine().split("");
		HashSet<String> Operand = new HashSet<String>();
		HashMap<String, Integer> isp = new HashMap<String, Integer>();
		HashMap<String, Integer> icp = new HashMap<String, Integer>();
		
		isp.put("(", 0);
		isp.put(")", 3);
		isp.put("+", 1);
		isp.put("-", 1);
		isp.put("*", 2);
		isp.put("/", 2);
		
		icp.put("(", 4);
		icp.put(")", 3);
		icp.put("+", 1);
		icp.put("-", 1);
		icp.put("*", 2);
		icp.put("/", 2);
		
		for (char i = 'A'; i <= 'Z'; i++) {
			String a = Character.toString(i);
			Operand.add(a);
		}
		
		
		for (int i = 0; i < T.length; i++) {
			if (Operand.contains(T[i]) == true) {
				sb.append(T[i]);
			} else if (T[i].equals(")")) {
				while(!stack.peek().equals("(")) {
					sb.append(stack.pop());
				}
				if (stack.peek().equals("("))
					stack.pop();
			} else if (T[i].equals("(")) {
				stack.push(T[i]);
			} else {
				if ((stack.empty() == true) || (isp.get(stack.peek()) < icp.get(T[i])))
					stack.push(T[i]);
				else if ((isp.get(stack.peek()) >= icp.get(T[i]))) {
					while((isp.get(stack.peek()) >= icp.get(T[i]))) {
						sb.append(stack.pop());
						if (stack.empty())
							break;
					}
					stack.push(T[i]);
				}
			}
		}
		
		while (!(stack.empty() == true))
			sb.append(stack.pop());
		
		System.out.println(sb);
	}
}