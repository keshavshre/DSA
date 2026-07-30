class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        func1(0,arr,0,res);
        return res;
    }
    public static void func1(int ind,int[]arr,int sum,ArrayList<Integer>res){
        if(ind==arr.length){
            res.add(sum);
            return;
        }
        func1(ind+1,arr,sum+arr[ind],res);
        func1(ind+1,arr,sum,res);
    }
}