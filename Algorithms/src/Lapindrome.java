//https://www.codechef.com/LRNDSA01/problems/LAPIN
import java.util.*;
public class Lapindrome {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int noTest=scan.nextInt();
		String str;
		if(noTest>=1 && noTest <=100) {
			for(int i=0; i<noTest; i++) {
					str=scan.next();
				System.out.println(lapindrome(scan.next().toLowerCase()));										
			}
		}
		else
			System.out.println(noTest);
		
	}

	private static String lapindrome(String str) {
		int tlen = str.length();
		int midInd =tlen/2;
		String leftStr = str.substring(0, midInd);
		String rightStr;
		
		
		if(tlen%2 != 0)
		{
			rightStr = str.substring(midInd+1, tlen);
		}
		else
			rightStr = str.substring(midInd, tlen);
		
		List<Character> lchar1 = new ArrayList<Character>(midInd);
		List<Character> lchar2 = new ArrayList<Character>(midInd);
		
		for(int i=0; i<midInd;i++ ) {
			lchar1.add(leftStr.charAt(i));
			lchar2.add(rightStr.charAt(i));
			
		}
		
		String lapi="YES";
		Collections.sort(lchar1);
		Collections.sort(lchar2);
		for(int j=0; j<midInd; j++)  {
			if(lchar1.get(j) != lchar2.get(j)) {
				lapi="NO";
				break;
			}
		}
		
								
		return lapi;
	}
}
