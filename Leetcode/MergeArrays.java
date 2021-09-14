import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 0 };
		int m = 0;
		int n = 1;
		int[] nums2 = { 1 };
		merge(nums1, m, nums2, n);
		System.out.println("main"+ nums1);
		System.out.println(Arrays.toString(nums1));
	}

//  1 2 9 10 11 13 10 11 12 13    // 
//  2 3 5 12


	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m + n - 1;
		int i = m - 1;
		int j = n -1;
		if(m == 0)
			nums1[0] = nums2[0];
		while( j >= 0) {
			if(i >= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			}
			else
			{
				nums1[k] = nums2[j];
				j--;
				k--;
				
			}
			
		}
		
	}
	
}