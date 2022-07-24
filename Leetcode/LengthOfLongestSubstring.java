import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        Set<Character> charApparitions = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int length;
        while(left <= right && right < s.length()){
            if(charApparitions.contains(s.charAt(right))){
                while(charApparitions.contains(s.charAt(right))){
                    charApparitions.remove(s.charAt(left));
                    left++;
                }
            }
            charApparitions.add(s.charAt(right));
            right++;
            length = right - left;
            maxLength = Math.max(maxLength, length);
        }
        maxLength = Math.max(maxLength, s.length() - left);

        return maxLength;
    }
}
