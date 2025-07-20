class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        // dp[i][j] will store the length of the LCS of 
        // text1's first i characters and text2's first j characters.
        int[][] dp = new int[m + 1][n + 1];
        
        // Build the dp table from the bottom up.
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters at the current positions match...
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // The LCS length is 1 + the LCS of the strings before these characters.
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // If characters do not match, the LCS is the best of the two subproblems:
                    // 1. Excluding the current character of text1.
                    // 2. Excluding the current character of text2.
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // The value in the bottom-right corner of the table is the answer.
        return dp[m][n];
    }
}