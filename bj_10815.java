package basicpractice;
import java.util.*;
import java.io.*;

public class bj_10815 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		HashSet<Integer> d = new HashSet<Integer>();
		
		while(st.hasMoreTokens()) {
			int num = Integer.valueOf(st.nextToken());
			d.add(num);
		}
		
		int M = Integer.valueOf(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			int num = Integer.valueOf(st.nextToken());
			if (d.contains(num))
				sb.append("1 ");
			else 
				sb.append("0 ");
		}
		System.out.println(sb);
	}
}
