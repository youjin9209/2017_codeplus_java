package basicpractice;
import java.util.*;

public class adjacentArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
		
		for (int i = 1; i <= n; i++) 
			a[i] = new ArrayList<Integer>();
		
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		
	}

}
