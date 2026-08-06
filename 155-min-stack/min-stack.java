class MinStack {
    Stack<Long>s;
    Long min=Long.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        Long value=Long.valueOf(val);
        if(s.isEmpty()){
            s.push(value);
            min=value;
        }
        else{
            if(value>=min){
                s.push(value);
            }
            else{
                s.push(2*value-min);
                min=value;
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty())return;
        long rem=s.pop();
        if(rem<min){
            min=2*min-rem;
        }
    }
    
    public int top() {
        if(s.isEmpty())return -1;
        Long val=s.peek();
        if(val<min){
            return min.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */