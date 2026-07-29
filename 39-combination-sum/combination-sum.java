class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>ans=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        int ind=0;
        func(0,candidates,target,ans,res);
        return res;
    }
    public void func(int ind,int[]candidates,int target,List<Integer>ans,List<List<Integer>>res){
        if(target<0)return;
        if(ind==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        ans.add(candidates[ind]);
        func(ind,candidates,target-candidates[ind],ans,res);
        ans.remove(ans.size()-1);
        func(ind+1,candidates,target,ans,res);
    }
}