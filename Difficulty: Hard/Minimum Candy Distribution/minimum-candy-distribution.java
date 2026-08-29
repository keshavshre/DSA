class Solution {
    public int minCandy(int arr[]) {
        // code here
        int n=arr.length;
        int []can=new int[n];
        Arrays.fill(can,1);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                can[i]=can[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                can[i]=Math.max(can[i],can[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=can[i];
        }
        return sum;
    }
}
