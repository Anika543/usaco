package kattis;
import java.util.Scanner; 
class Basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int aScore = 0;
		int bScore = 0; 
		
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i)=='A') {
				aScore += input.charAt(i+1); 
			}if(input.charAt(i)=='B') {
				bScore += input.charAt(i+1); 
			}
			if(aScore>=11 && aScore>=(bScore+2)) {
				break; 
			}if(bScore>=11 && bScore>=(aScore+2)) {
				break; 
			}
		}
		
		if(aScore>bScore) {
			System.out.println("A");
		}else {
			System.out.println("B"); 
		}
	}

}
