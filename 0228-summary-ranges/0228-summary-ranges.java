import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return list;
        }

        int i = 0;
        while (i < nums.length) {
            int first = nums[i];
            int j = i; // Initialize j to the current start of the potential range

            // Find the end of the current continuous sequence
            // Condition 1: Ensure j+1 is within bounds BEFORE accessing nums[j+1]
            // Condition 2: Check if the next number is consecutive
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                j++; // Move j to the next consecutive number
            }
            // After the loop, nums[j] is the last number in the current range

            int last = nums[j]; // The 'last' variable should store the value, not the index j

            if (first == last) {
                list.add(String.valueOf(first)); // Convert int to String
            } else {
                list.add(first + "->" + last);
            }

            i = j + 1; // Move 'i' to the element AFTER the current range to start a new search
        }

        return list;
    }
}