package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class solver {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
	    int N = sc.nextInt();
	    int[] intArray= new int[150];
	    for(int i = 0; i < N; i++){
			intArray[i] = sc.nextInt();
			
		}
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		int maxInt = findMaxIntInArray(intArray);
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max=intArray[0];
		for (int i : intArray) {
			if(i> max)
				max = i;
		}
		return max;
	}
}