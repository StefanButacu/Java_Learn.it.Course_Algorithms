import java.util.Arrays;

public class TwoSum {
	public static void main(String[] arg) {
		int[] numbers = {5,25,75};
		System.out.println(Arrays.toString(twoSum(numbers, 100)));
		
	}
	
	public static int[] twoSum(int []numbers, int target) {
		int[] ans = new int[2];
		for(int i = 0; i < numbers.length - 1; i++) {
			int poz =  binarySearch(numbers,i +1 , numbers.length, target-numbers[i]);
			if(  poz > 0) {
				// System.out.println("i=" + i + "p= " + poz);
				ans[0] = i + 1;
				ans[1] = poz + 1;
				break;
				
			}
			
			
			
		}
		return ans;
		
	}

	private static int binarySearch(int[] numbers, int left, int right, int target) {
		while(left <= right && left < numbers.length) {
			int mid = (left + right) / 2;
			if(numbers[mid] == target)
				return mid;
			if(numbers[mid] < target)
				left = mid + 1;
			else
				right = mid -1;
			
		}
		
		return -1;
	}
}

