class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                counter++;
                max=Math.max(max,counter);
            }
            if(num!=1){
                counter=0;
            }
        }
        return max;
    }
}