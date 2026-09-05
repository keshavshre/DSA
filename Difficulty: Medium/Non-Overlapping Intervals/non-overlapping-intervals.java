class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        ArrayList<int[]>ans=new ArrayList<>();
        for(int[]i:intervals){
            ans.add(i);
        }
        ans.sort(Comparator.comparingInt(a->a[1]));
        int last=ans.get(0)[1];
        int count=0;
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)[0]<last){
                count++;
            }
            else{
                last=ans.get(i)[1];
            }
        }
        return count;
    }
}
