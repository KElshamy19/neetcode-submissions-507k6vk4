class MinStack {
    private List<Integer> stack = new ArrayList();
    private List<Integer> min = new ArrayList();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        int minVal;
        if(!min.isEmpty()&&min.getLast()<val)
            minVal=min.getLast();
        else minVal = val;

        min.add(minVal);
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
