import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countN = countDigits(n);
        
        for (int i = 0; i < 31; i++) { // 2^0 to 2^30
            int power = 1 << i;
            if (Arrays.equals(countN, countDigits(power))) {
                return true;
            }
        }
        return false;
    }

    private int[] countDigits(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return count;
    }
}
