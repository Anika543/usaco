package USACO;

import java.io.*;
import java.util.StringTokenizer;

public class FencePainting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		// Read first line
		StringTokenizer st = new StringTokenizer(r.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		// Read second line
		st = new StringTokenizer(r.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int largest = Math.max(b, d);
		int smallest = Math.min(a, c);
		int largeTotal = largest - smallest;

		int x;
		int totalPainted;
		if (b < c) {
			x = c - b;
			totalPainted = largeTotal - x;
		} else {
			totalPainted = largeTotal;
		}

		pw.print(totalPainted);

		pw.close();

	}

}
