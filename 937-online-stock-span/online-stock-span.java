class StockSpanner {
     Stack<Integer> stack = new Stack();
     HashMap<Integer,Integer> map = new HashMap();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int cnt=1;
        while(!stack.isEmpty() && (stack.peek()<=price)){
            if(map.get(stack.peek())!=1){
                cnt+=map.get(stack.peek());
            }
            else{
                cnt++;
            }
            stack.pop();
        }
        map.put(price,cnt);
        stack.push(price);
        return cnt;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */