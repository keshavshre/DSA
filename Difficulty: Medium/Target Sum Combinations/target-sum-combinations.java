class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>curr=new ArrayList<>();
        func(0,arr,curr,res,target);
        return res;
    }
    public static void func(int ind,int[]arr,ArrayList<Integer>curr,ArrayList<ArrayList<Integer>>res,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || arr.length==ind){
            return;
        }
        curr.add(arr[ind]);
        func(ind,arr,curr,res,target-arr[ind]);
        curr.remove(curr.size()-1);
        func(ind+1,arr,curr,res,target);
    }
}