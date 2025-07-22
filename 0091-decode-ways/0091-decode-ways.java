class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        
        int first = 1;
        int second = 1;
        
        for (int i = 1; i < s.length(); i++) {
            int current = 0;
            
            // Check single digit decoding
            if (s.charAt(i) != '0') {
                current += first;
            }
            
            // Check two digit decoding (only if i >= 1)
            int value = Integer.parseInt(s.substring(i - 1, i + 1));
            if (value >= 10 && value <= 26) {
                current += second;
            }
            
            // Move window
            second = first;
            first = current;
        }
        
        return first;
    }
}
