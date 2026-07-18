class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
            