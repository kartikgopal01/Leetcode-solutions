class Solution {
    public int rob(int[] nums) {
        int first1=0,second1=0;
        int first2=0,second2=0;
        int max1=0,max2=0;
        if(nums.length<=1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            max1=Math.max(first1+nums[i],second1);
            first1=second1;
            second1=max1;
        }
        for(int i=1;i<nums.length;i++){
            max2=Math.max(first2+nums[i],second2);
            first2=second2;
            second2=max2;
        }
        return Math.max(max1,max2);
    }
}