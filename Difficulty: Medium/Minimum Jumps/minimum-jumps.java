class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n=arr.length;
        int far=0;
        for(int i=0;i<n;i++){
            if(i>far)return -1;
            far=Math.max(far,i+arr[i]);
        }
        return func(arr);
    }
    public int func(int[]arr){
        int n=arr.length;
        int l=0;
        int r=0;
        int jumps=0;
        while(r<n-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(far,i+arr[i]);
            }
            l=r+1;
            r=far;
            jumps++;
        }
        return jumps;
    }
}