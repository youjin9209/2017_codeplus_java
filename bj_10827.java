package basicpractice;
import java.util.*;
import java.math.*;

public class bj_10827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		int b = sc.nextInt();
		
		BigDecimal c = a.pow(b);
		System.out.println(c.toPlainString());
	}
}
