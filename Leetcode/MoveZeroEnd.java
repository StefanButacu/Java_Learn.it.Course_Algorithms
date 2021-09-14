import java.util.Arrays;

public class MoveZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 
	 * 
	 */
	public static void moveZeros(int[] nums) {
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] == 0) {
				for(int j = i + 1; j < nums.length; j++) {
					if( nums[j] != 0)
					{
						int aux = nums[j];
						nums[j] = nums[i];
						nums[i] = aux;
						break;
					}
					
					
				}
				
				
			}
			
		}
	
		
	}

}
