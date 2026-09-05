class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]>res=new ArrayList<>();
        for(int[]interval:intervals){
            if(interval[1]<newInterval[0]){
                res.add(interval);
            }
            else if(interval[0]>newInterval[1]){
                res.add(newInterval);
                newInterval=interval;
            }
            else{
                newInterval[0]=Math.min(interval[0],newInterval[0]);
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }
        }
        res.add(newInterval);
        return res;
    }
}
