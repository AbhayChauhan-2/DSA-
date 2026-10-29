// class Solution {
//     ArrayList<Integer> num= new ArrayList<>();
//     public int findKthLargest(int[] nums, int k) {
//          num.clear();
//         for ( int i =0;i<nums.length;i++){
//             insert(nums[i]);
//         }
//          int ans =-1;
//          for ( int i =0;i<k;i++){
//             ans= maxextarct();
//          }
//           return ans ;
    
        
//     }
//     public void insert(  int numm){
//         num.add(numm);
//         int index=num.size()-1;
       
//          while( index>0){
//              int parent  =(index-1)/2;
//              if ( num.get(parent)<num.get(index)){
//                 int temp =num.get(parent);
//                 num.set(parent,num.get(index));
//                 num.set(index,temp);
//                 index=parent; 
//              }
//              else return ;
//          }
//     }
// public int maxextarct() {
//     int max = num.get(0);
//     int last = num.remove(num.size() - 1);

//     if (!num.isEmpty()) {
//         num.set(0, last);
//         int index = 0;

//         while (true) {
//             int largest = index;
//             int left = 2 * index + 1;
//             int right = 2 * index + 2;

//             if (left < num.size() && num.get(left) > num.get(largest)) {
//                 largest = left;
//             }

//             if (right < num.size() && num.get(right) > num.get(largest)) {
//                 largest = right;
//             }

//             if (largest == index) break;

//             int temp = num.get(index);
//             num.set(index, num.get(largest));
//             num.set(largest, temp);

//             index = largest;
//         }
//     }

//     return max;
// }
// }
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}