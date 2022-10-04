public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aacabdkacaa";
//        System.out.println(longestPalindrome(s));
        s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s){
        // dp[i][j] = true if Si...Sj is palindrome
        // dp[i][j] = true if (dp[i+1][j-1]= true & S[i] == S[j]
        //             false
        int maxLength = 0;
        int n = s.length();
        int startIndex=0, endIndex=0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n ; i++)
            dp[i][i] = true;
        for(int i = 0 ; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
            {
                dp[i][i + 1] = true;
                maxLength = 2;
                startIndex = i;
                endIndex = i + 1;
            }
        }
        for(int i = n-2; i >=0 ; i--){
            for(int j = i+1 ; j < n ; j++){
                if(s.charAt(i) == s.charAt(j)) {
                    if (dp[i + 1][j - 1]) {
                        dp[i][j] = dp[i + 1][j - 1];
                        if ( j - i + 1 >= maxLength) {
                            maxLength = j - i + 1;
                            startIndex = i;
                            endIndex = j;
                        }
                    }
                }
            }

        }
//         for(int i = 0 ; i < n ; i++){
//             System.out.print(i + " :");

//             for(int j = 0 ; j < n ; j++){
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();

//         }
        return s.substring(startIndex, endIndex+1);
    }
}
