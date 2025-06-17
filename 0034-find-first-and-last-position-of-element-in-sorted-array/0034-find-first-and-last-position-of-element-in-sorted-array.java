class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);   // Find first occurrence
        int last = findIndex(nums, target, false);   // Find last occurrence
        return new int[]{first, last};
    }

    private int findIndex(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                index = mid;
                if (findFirst) {
                    end = mid - 1;  // Keep searching left
                } else {
                    start = mid + 1; // Keep searching right
                }
            }
        }

        return index;
    }
}
