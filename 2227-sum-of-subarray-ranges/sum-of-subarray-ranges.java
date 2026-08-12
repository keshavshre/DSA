class Solution {
    public long subArrayRanges(int[] nums) {
        return submax(nums)-submin(nums);
    }
    public long submax(int[]arr){
        int n=arr.length;
        Stack<Integer>s=new Stack<>();
        int[]nge=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            nge[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        s.clear();
        int[]pge=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            pge[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            sum+=(left*right*arr[i]);
        }
        return sum;
    }
    public long submin(int[]arr){
        int n=arr.length;
        int []pse=new int[n];
        int []nse=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            nse[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            pse[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum=sum+(arr[i]*left*right);
        }
        return sum;    
    }
}