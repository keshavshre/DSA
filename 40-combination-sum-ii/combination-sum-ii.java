class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(candidates);
        func(0,candidates,target,curr,res);
        return res;
    }
    public static void func(int ind,int[]candidates,int target,List<Integer>curr,List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i-1]==candidates[i])continue;
            if(candidates[i]>target)break;
            curr.add(candidates[i]);
            func(i+1,candidates,target-candidates[i],curr,res);
            curr.remove(curr.size()-1);
        }
    }
}