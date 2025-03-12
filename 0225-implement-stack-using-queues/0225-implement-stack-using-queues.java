class MyStack {
     Queue<Integer> queue;
     Queue<Integer> queue2;

    public MyStack() {
        queue=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    
    public void push(int x) {
        while(queue.size()>0){
            queue2.add(queue.remove());
        }
        queue.add(x);
        while(queue2.size()>0){
            queue.add(queue2.remove());
        }
        
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */