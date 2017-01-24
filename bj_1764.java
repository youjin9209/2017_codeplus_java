package basicpractice;
import java.util.*;
import java.io.*;

public class bj_1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		int n = Integer.valueOf(line[0]);
		int m = Integer.valueOf(line[1]);
		HashMap<String, Integer> d = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = bf.readLine();
			d.put(name, 1);
		}
		
		for (int i = 0; i < m; i++) {
			String name = bf.readLine();
			Integer v = d.get(name);
			if (v == null) { //map에 들어있지 않은 경우 
				v = 0;
			}
			
			v += 2;
			d.put(name, v);
		}
		
		ArrayList<String> a = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : d.entrySet()) { //순회 -value가 3 인것 찾기 위해 
			String key = entry.getKey();
			Integer value = entry.getValue();
			if (value == 3) {
				a.add(key);
			}
		}
		
		System.out.println(a.size());
		Collections.sort(a); //사전순  출력 
		for (String name : a) {
			System.out.println(name);
		}
	}

}
