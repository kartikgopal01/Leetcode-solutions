class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reachable distance, return false
            if (i > maxReach) {
                return false;
            }

            // Update maxReach
            maxReach = Math.max(maxReach, i + nums[i]);

            // If maxReach reaches or exceeds the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}