class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        int ans=0;
        for(int num:nums){
            if(map.get(num)==1){
                ans=num;
            }
        }
        return ans;

    }
}