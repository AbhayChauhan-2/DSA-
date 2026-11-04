class MedianFinder {
     PriorityQueue<Integer> pqleft;
     PriorityQueue<Integer> pqright;

    public MedianFinder() {
        pqleft= new PriorityQueue<>(Collections.reverseOrder());
        pqright= new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if ( !pqleft.isEmpty() && num<=pqleft.peek()){
            pqleft.add(num);

        }
        else{
            pqright.add(num);
        }
         if ( pqleft.size()-pqright.size()>1){
            pqright.add(pqleft.poll());
         }
         else if (pqright.size() > pqleft.size()){
             pqleft.add(pqright.poll());
         }
        
    }
    
    public double findMedian() {
        if (pqleft.size()==pqright.size()){
            return ((double)pqleft.peek()+pqright.peek())/2;
        }
        return pqleft.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */