import java.util.Arrays;
import java.util.LinkedList;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] ans = intersect(nums1, nums2);
		System.out.println(Arrays.toString(ans));
		
	}
	public static int[] intersect(int []nums1, int[] nums2) {
		int[] fr1 = new int[1001];
        int[] fr2 = new int[1001];
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int n = 0;
        for(int x: nums1)
            fr1[x]++;
        for(int x: nums2)
            fr2[x]++;
        int contor;
        for(int i = 0 ; i < 1001; i++){
            if( fr1[i] != 0 && fr2[i] != 0){
                contor = (fr1[i] < fr2[i]) ? fr1[i] : fr2[i];
                while(contor > 0){
                	ans.add(i);
                    contor--;
                    }
                
            } 
            
            
        }
        int[] res = new int[ans.size()];
        int i = 0;
        for(int num:ans) {
        	res[i++] = num;
        	
        }
        return res;
		
		
		
	}
}
