public class ReverseOnlyLetters {
    public static void main(String[] args){

        String s = "?6C40E";
        System.out.println(reverseOnlyLetters(s));
    }
    public static boolean isLowercaseChar(char c){
        return 'a' <=c && c <= 'z';
    }
    public static boolean isUppercaseChar(char c){
        return 'A' <= c && c <= 'Z';
    }
    public static String reverseOnlyLetters(String s) {

       char[] ch = new char[s.length()];
        for(int i = 0 ; i < s.length(); i++)
            ch[i] = s.charAt(i);
        int i = 0;
        int j = s.length() - 1;
        while( i < j){
            while(i < s.length() && !(isLowercaseChar(s.charAt(i)) || isUppercaseChar(s.charAt(i)))   )
            {
                i++;
                if( i == j)
                    return new String(ch);
            }
            while(j >= 0 && ! (isLowercaseChar(s.charAt(j)) || isUppercaseChar(s.charAt(j)))   )
            {
                j--;
                if( i == j)
                    return new String(ch);
            }
            if( i == s.length() || j == -1)
                return new String(ch);
            char aux = ch[i];
            ch[i] = ch[j];
            ch[j] = aux;
            i++;
            j--;
        }

        return new String(ch);
    }
}
