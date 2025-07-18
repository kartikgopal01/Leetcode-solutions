class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max_area=0;
        while(left<right){
            int width=right-left;
            int current_area=Math.min(height[left],height[right])*width;
            max_area=Math.max(max_area,current_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return max_area;
    }
}