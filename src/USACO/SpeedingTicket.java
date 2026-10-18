package USACO;

import java.io.*;
import java.util.StringTokenizer;

public class SpeedingTicket {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] nDistance = new int[n];
		int[] nSpeedLimit = new int[n];

		int[] mDistance = new int[m];
		int[] mSpeed = new int[m];

		for (int i = 0; i < n; i++) {
			StringTokenizer st1 = new StringTokenizer(r.readLine());
			nDistance[i] = Integer.parseInt(st1.nextToken());
			nSpeedLimit[i] = Integer.parseInt(st1.nextToken());
		}
		for (int i = 0; i < m; i++) {
			StringTokenizer st1 = new StringTokenizer(r.readLine());
			mDistance[i] = Integer.parseInt(st1.nextToken());
			mSpeed[i] = Integer.parseInt(st1.nextToken());
		}
		
		
		int[] speedLimit = new int[100]; 
		int[] speedTravelling = new int[100]; 
		int tracker = 0; 
		
		for(int i = 0 ; i<n; i++) {
			int length = nDistance[i];
			int speed = nSpeedLimit[i]; 
			for(int j =0; j<length; j++) {
				speedLimit[tracker] = speed;
				tracker++; 
			}
		}
		
		tracker = 0; 
		for(int i = 0 ; i<n; i++) {
			int length = mDistance[i];
			int speed = mSpeed[i]; 
			for(int j =0; j<length; j++) {
				speedTravelling[tracker] = speed;
				tracker++; 
			}
		}
		
		int ans = 0; 
		for(int i=0; i<100; i++) {
			if((speedTravelling[i] - speedLimit[i]) > ans) {
				ans = (speedTravelling[i] - speedLimit[i]); 
			}
		}
		
		pw.print(ans);
		pw.close(); 

	}
	
	
	
	
	
	
	
	
	
	
}
