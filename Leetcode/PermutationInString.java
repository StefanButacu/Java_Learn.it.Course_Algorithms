import java.util.zip.CheckedInputStream;

public class PermutationInString {
	
	
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eibdaooo";
		System.out.println(checkInclusion(s1,s2));
		
		
		
	}
	 public static boolean checkInclusion(String s1, String s2) {
	     int i,j;
		 int s2Pointer, s1Pointer;
		 boolean found = false;
	     for( i = 0 ; i < s2.length(); i++) {
	    	 found = false;
	    	 for( j = 0 ; j < s1.length(); j++) {
	    		 if(s2.charAt(i) == s1.charAt(j)) {
	    			 found = true;
	    			 break; 
	    		 }
    		 }
	    
	     }   
		 
		 return false;
	    }
}
