class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>s=new Stack<>();
        for(int num:asteroids){
            boolean dest=false;
            while(!s.isEmpty() && s.peek()>0 && num<0){
                if(s.peek()<-num){
                    s.pop();
                }
                else if(s.peek()==-num){
                    s.pop();
                    dest=true;
                    break;
                }
                else{
                    dest=true;
                    break;
                }
            }
            if(!dest)s.push(num);
        }
        int[]ans=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=s.pop();
        }
        return ans;
    }
}