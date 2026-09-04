class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        ArrayList<int[]>ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int []curr=intervals[0];
        ans.add(curr);
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=curr[1]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }
            else{
                curr=intervals[i];
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}