package basicpractice;
import java.util.*;

public class setpractice {

	public static void main(String[] args) {
		//HashSet<Integer> d = new HashSet<Integer> ();
		//TreeSet<Integer> d = new TreeSet<Integer>();
		LinkedHashSet<Integer> d = new LinkedHashSet<Integer>();
		for (int i = 10; i >= 1; i--) {
			d.add(i);
		}
		
		for (int x : d) {
			System.out.print(x + " ");
		}

	}

}
