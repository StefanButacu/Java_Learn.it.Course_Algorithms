
public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "leetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) {
        int[] charMap = new int[26];

        for(int i = 0 ; i < s.length(); i++) {
        	char c = s.charAt(i);
        	charMap[c-'a']++;
        		
        }
        for(int i = 0 ; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(charMap[c-'a'] == 1) {
        		return i;
        		
        	}
        
        }
        return -1;
      
	}
}
