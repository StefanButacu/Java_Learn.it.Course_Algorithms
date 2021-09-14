import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
		
		String a = new String("Let's take LeetCode contest");
		String ans = reverseWords(a);
		System.out.println(ans);
	}
	   public static void reverseString(char[] s) {
	        int i = 0;
	        int j = s.length - 1;
	        while( i <= j){
	            char aux = s[i];
	            s[i] = s[j];
	            s[j] = aux;
	            i++;
	            j--;
	            
	        }
	    }
	    public static String reverseWords(String s) {
	    	int i = 0;
	    	int j = i+1;
	    	String ans = new String();
	    	while( i < s.length()) {
	    		while(j < s.length() && s.charAt(j) != ' ' )
	    			j++;
	    		for(int k = j - 1; k >= i; k--)
	    			ans += s.charAt(k);
	    		if( j < s.length())
	    			ans += ' ';
	    		i = j+1;
	    		j++;
	    	}
	    	return ans;
	    	
	    }
}
