class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        func(0,nums,curr,res);
        return res;
    }
    public static void func(int ind,int[]nums,List<Integer>curr,List<List<Integer>>res){
        if(ind==nums.length){
            if(res.contains(curr)){
                return;
            }
            else{
                res.add(new ArrayList<>(curr));
                return;
            }
        }
        curr.add(nums[ind]);
        func(ind+1,nums,curr,res);
        curr.remove(curr.size()-1);
        func(ind+1,nums,curr,res);
    }
}