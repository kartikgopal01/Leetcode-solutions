class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int min=nums[0] , max=nums[0];
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            int temp=Math.max(cur,Math.max(cur*min,cur*max));
            min=Math.min(cur,Math.min(cur*min,cur*max));
            max=temp;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}