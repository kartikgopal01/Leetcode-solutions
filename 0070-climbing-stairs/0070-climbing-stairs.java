class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;
        int second = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second; // DP relation: f(n) = f(n-1) + f(n-2)
            first = second;
            second = current;
        }

        return current;
    }
}
