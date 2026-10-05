class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n= nums.length;
         long arr[] =new long[n+1];
     
         for( int i =0;i<n;i++){
            arr[i+1]=arr[i]+nums[i];

         }
         int len= n+1;
        Deque<Integer> de= new ArrayDeque<>();
         for( int i =0;i<=n;i++){
             while(!de.isEmpty()&& arr[i]-arr[de.peekFirst()]>=k){
                len=Math.min(len, i-de.pollFirst());
             }
             while (!de.isEmpty() && arr[i] <= arr[de.peekLast()]) {
                de.pollLast();
          }
            de.offerLast(i);
         }
      return len== n + 1 ? -1 : len;
 
    }
}