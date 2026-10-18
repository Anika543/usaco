package USACO;

import java.io.*;
import java.util.StringTokenizer;

public class WeirdAlgorithm {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());

		int n = Integer.parseInt(st.nextToken());
	

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				pw.print(n + "");
			}
			else {
				n = 3 * n + 1;
				pw.print(n + " ");
			}
		
		}
		
		pw.close(); 
		
		

	}
}
