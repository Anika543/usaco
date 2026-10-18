package USACO;

import java.io.*;
import java.util.StringTokenizer;

public class ShellGame {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
		int N = Integer.parseInt(r.readLine());
		int[] a = new int[N];
		int[] b = new int[N];
		int[] g = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(r.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			g[i] = Integer.parseInt(st.nextToken());
		}

		int maxScore = 0;

		for (int i = 0; i < 3; i++) {
			int score = 0;
			int[] shellLocation = { 0, 0, 0 };
			shellLocation[i] = 1;

			for (int j = 0; j < N; j++) {
				int x = a[j] - 1;
				int y = b[j] - 1;

				int temp = shellLocation[x];
				shellLocation[x] = shellLocation[y];
				shellLocation[y] = temp;

				if (shellLocation[g[j] - 1] == 1) {
					score++;
				}
			}

			maxScore = Math.max(maxScore, score);
		}

		pw.println(maxScore);
		pw.close();
	}
}
