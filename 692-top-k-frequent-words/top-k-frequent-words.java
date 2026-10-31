class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        HashMap<String,Integer> map= new HashMap();
        for( int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });
        for( String val: map.keySet()){
            pq.add(val);
        }
         List<String>ans= new ArrayList();
         for ( int i =0;i<k;i++){
             ans.add(pq.poll());
         }
          return ans ; 
    }
}