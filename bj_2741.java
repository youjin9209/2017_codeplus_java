package basicpractice;
import java.util.*;

public class bj_2741 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int i;
		
		for(i = 1; i <= n; i++)
			sb.append(i+"\n");
		System.out.println(sb);
	}
}