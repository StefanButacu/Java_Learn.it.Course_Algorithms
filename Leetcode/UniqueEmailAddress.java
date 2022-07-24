import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"}));

    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String s: emails){
            StringBuilder builder = new StringBuilder();
            int i = 0;
            boolean foundArond = false;
            while(i < s.length()){
                if(s.charAt(i) == '@') {
                    builder.append(s.substring(i));
                    break;
                }
                if(s.charAt(i) == '.') {
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='+'){
                    while(i+1 < s.length() && s.charAt(i+1) != '@') {
                        i++;
                    }
                    builder.append(s.substring(i+1));
                    break;
                }
                else
                    builder.append(s.charAt(i));
                i++;
            }
            uniqueEmails.add(builder.toString());
        }
        return uniqueEmails.size();
    }
}
