class MinStack {
    private List<Integer> stack = new ArrayList();
    private List<Integer> min = new ArrayList();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        if(!min.isEmpty()){
            int minVal=min.getLast();
            if(val<minVal)
                minVal=val;
            min.add(minVal);
        }
        else min.add(val);
    }
    
    public void pop() {
        stack.removeLast();
        min.removeLast();
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        return min.getLast();
    }
}
