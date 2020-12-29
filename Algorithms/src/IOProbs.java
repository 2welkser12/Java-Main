import java.util.Scanner;

public class IOProbs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			num = scan.nextInt();
			if(num != 42)
				System.out.println(num);
			else
			{
				scan.close();
				break;
			}
				
		}
		
		
		
	}

}
