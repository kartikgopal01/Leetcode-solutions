class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int ans = nums[0];
        
        while (left <= right) {
            if (nums[left] < nums[right]) {
                ans = Math.min(ans, nums[left]);
                break; // Minimum found
            }

            int mid = left + (right - left) / 2;
            ans = Math.min(ans, nums[mid]);

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return ans;
    }
}
