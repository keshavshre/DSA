class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        int[]arr={1,2,3,4,5,6,7,8,9};
        func(0,k,n,arr,curr,res);
        return res;
    }
    public static void func(int ind,int k,int n,int[]arr,List<Integer>curr,List<List<Integer>>res){
        if(ind==arr.length){
            int sum=0;
            for(int num:curr){
                sum+=num;
            }
            if(curr.size()==k && sum==n){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(arr[ind]);
        func(ind+1,k,n,arr,curr,res);
        curr.remove(curr.size()-1);
        func(ind+1,k,n,arr,curr,res);
    }
}