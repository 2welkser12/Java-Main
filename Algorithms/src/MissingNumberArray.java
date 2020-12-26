import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberArray {
	
	public static void main(String[] args) {
		int[] intArray = new int[] {7,2,3,5,1};
		
		
		printArray(sortArray(intArray));
		
		System.out.println(missingNumber(sortArray(intArray)));
		System.out.println(missingNumber(sortArray(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10})));
		System.out.println(missingNumber(sortArray(new int[]{1, 2, 3, 4, 6, 9, 8})));


	}
	
	public static void printArray(int[] arr) {
		
		for(int i: arr) {
		System.out.println(i);
		}
		
	}
	
	public static int missingNumber(int[] arr) {
		int missingNo=0;
		int[] sortArray = sortArray(arr);
		for(int i=0; i<sortArray.length; i++) {
			if(sortArray[i+1] - sortArray[i] != 1 ) {
				missingNo = sortArray[i]+1;
				return missingNo;
			}
		}
		return missingNo;
	}

	private static int[] sortArray(int[] arr) {
		
		int[] sortArray = arr;
		int temp= sortArray[0];
		for(int i=0; i< sortArray.length; i++) {
			for(int j =i+1; j< sortArray.length; j++) {
				if(sortArray[i] > sortArray[j])
				{
					temp = sortArray[j];
					sortArray[j]=sortArray[i];
					sortArray[i]=temp;
				}
			}
		}
		
		return sortArray;
	}
}
