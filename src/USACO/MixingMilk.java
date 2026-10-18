package USACO;

import java.io.*;
import java.util.StringTokenizer;

public class MixingMilk {
	public static void main(String[] args) throws IOException {

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int[] c = new int[3];
		int[] m = new int[3];

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(r.readLine());
			c[i] = Integer.parseInt(st.nextToken());
			m[i] = Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < 33; j++) {
			for (int i = 0; i < 3; i++) {
				if (i != 2) {
					m[i + 1] = m[i] + m[i + 1];
					m[i] = 0;
					if (m[i + 1] > c[i + 1]) {
						m[i] = m[i + 1] - c[i + 1];
						m[i + 1] = c[i + 1];
					}
				} else {
					m[0] = m[i] + m[0];
					m[i] = 0;
					if (m[0] > c[0]) {
						m[i] = m[0] - c[0];
						m[0] = c[0];
					}

				}
			}
		}

		m[1] = m[0] + m[1];
		m[0] = 0;
		if (m[1] > c[1]) {
			m[0] = m[1] - c[1];
			m[1] = c[1];
		}
		
		
		for(int i = 0; i<3; i++) {
			pw.print(m[i]);
			pw.println(); 
		}
		pw.close(); 
		
	}
}




















