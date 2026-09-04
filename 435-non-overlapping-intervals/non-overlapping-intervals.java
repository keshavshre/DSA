class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<int[]>inter=new ArrayList<>();
        for(int[]i:intervals){
            inter.add(i);
        }
        inter.sort(Comparator.comparingInt(a->a[1]));
        int count=0;
        int prev=inter.get(0)[1];
        for(int i=1;i<inter.size();i++){
            if(prev>inter.get(i)[0]){
                count++;
            }
            else{
                prev=inter.get(i)[1];
            }
        }
        return count;
    }
}