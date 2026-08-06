class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            Stack<Integer>s=new Stack<>();
            for(int j=m-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    while(!s.isEmpty() && s.peek()<=nums2[j]){
                        s.pop();
                    }
                    ans[i]=s.isEmpty()?-1:s.peek();
                    s.push(nums2[j]);
                }
                else{
                    s.push(nums2[j]);
                }
            }
        }
        return ans;
    }
}