class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        ArrayList<int[]>ans=new ArrayList<>();
        for(int i=0;i<f.length;i++){
            ans.add(new int[]{f[i],s[i],i+1});
        }
        ans.sort(Comparator.comparingInt(a->a[0]));
        ArrayList<Integer>res=new ArrayList<>();
        int last=-1;
        for(int[]m:ans){
            if(m[1]>last){
                res.add(m[2]);
                last=m[0];
            }
        }
        Collections.sort(res);
        return res;
    }
}