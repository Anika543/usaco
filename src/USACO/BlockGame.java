package USACO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BlockGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String firstWord = st.nextToken();
			String secondWord = st.nextToken();

			int[] blocksFirst = blocksNeeded(firstWord);
			int[] blocksSecond = blocksNeeded(secondWord);

			for (int j = 0; j < 26; j++) {
				if (blocksFirst[j] > blocksSecond[j]) {
					alphabet[j] += blocksFirst[j];
				} else {
					alphabet[j] += blocksSecond[j];
				}
			}

		}
		
		for (int i = 0; i < alphabet.length; i++) {
			pw.println(alphabet[i]);
			
		}
		pw.close(); 
	}

	public static int[] blocksNeeded(String s) {
		int[] blocksNeeded = new int[26];
		for (int i = 0; i < s.length(); i++) {
			blocksNeeded[s.charAt(i) - 'a']++;
		}

		return blocksNeeded;
	}
}
