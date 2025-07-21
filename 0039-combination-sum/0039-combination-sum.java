class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> combinations=new ArrayList<>();
        backtrack(candidates,target,ans,combinations,0);
        return ans;
    }
    public void backtrack(int[] candidates,int target,List<List<Integer>> ans,List<Integer> combinations,int start){
        if(target==0){
            ans.add(new ArrayList<Integer>(combinations));
        }
        else if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            combinations.add(candidates[i]);
            backtrack(candidates,target-candidates[i],ans,combinations,i);
            combinations.remove(combinations.size()-1);
        }
    }
}