class Solution {
    public boolean canReach(int[] arr) {
        // code here
        int n=arr.length;
        int far=0;
        for(int i=0;i<n;i++){
            if(i>far)return false;
            far=Math.max(far,i+arr[i]);
        }
        return true;
    }
}