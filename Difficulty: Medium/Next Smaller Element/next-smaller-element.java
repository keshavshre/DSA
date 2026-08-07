class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int n=arr.length;
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            int val=s.isEmpty()?-1:s.peek();
            res.add(val);
            s.push(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}