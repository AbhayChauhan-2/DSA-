class MyQueue {
    Stack <Integer> stack1;
    Stack <Integer> stack2;



    public MyQueue() {
       stack1= new Stack<>();
       stack2= new Stack<>(); 
    }
    
    public void push(int x) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.peek());
           stack2.pop();
        }
        
    }
    
    public int pop() {
        int num= stack1.peek();
        stack1.pop();
        return num;
        
    }
    
    public int peek() {
         return stack1.peek();
        
    }
    
    public boolean empty() {
     if( stack1.size()==0){
         return true ;
     }   
     else{
         return false;
     }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */