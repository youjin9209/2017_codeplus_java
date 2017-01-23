package basicpractice;
import java.util.*;

public class bj_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int  temp = sc.nextInt();
			a.add(temp);
		}
		Collections.sort(a);
		for(int x : a) {
			System.out.println(x);
		}
		/* using get
		for (int i = 0; i < n; i++)
			System.out.println(a.get(i));
		 */
	}

}
