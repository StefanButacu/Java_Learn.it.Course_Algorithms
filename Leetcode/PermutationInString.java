import java.util.zip.CheckedInputStream;

public class PermutationInString {


    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));


    }

    public static boolean checkInclusion(String s1, String s2) {

        boolean isPermutation = false;
        int[] charFrS1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charFrS1[s1.charAt(i) - 'a']++;
        }
        int[] charFrS2 = new int[26];
        for (int i = 0; i < s2.length() - s1.length()+1; i++) {
            for (int j = 0; j < 26; j++)
                charFrS2[j] = 0;
            for (int j = 0; j < s1.length(); j++) {
                charFrS2[s2.charAt(i + j) - 'a']++;
            }
            isPermutation = true;
            for (int j = 0; j < 26 && isPermutation; j++) {
                if(charFrS1[j] != charFrS2[j])
                    isPermutation = false;
            }
            if(isPermutation)
                return true;
        }

        return false;
    }
}
