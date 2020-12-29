import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int revNum=0;
		int num;
		int lastDigit=0;
		int tc=scan.nextInt();
		
		for(int i=0; i<tc; i++) {
			num = scan.nextInt();
			
			if( num >= 1 && num <= 1000000)
			{
				
				while(num > 0) {
					lastDigit = num%10;
					num = num/10;
					if(num != 0)
						revNum = (lastDigit*10)+revNum*10;
					else
						revNum = revNum+lastDigit;
				}
			lastDigit=0;
				
			System.out.println(revNum);
			revNum=0;
			}
			else
				System.out.println("No doesn't follow 1 <= N <= 1000000 constraint");
		}

	}
}
