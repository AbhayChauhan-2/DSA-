class Solution {
    public int minimumDistance(int[] nums) {
         if ( nums.length<=2){
             return -1;
         }
        
         HashMap < Integer ,List<Integer> > hash= new HashMap();
         for( int i =0;i<nums.length;i++){
             if (! hash.containsKey(nums[i])){
                hash.put(nums[i], new ArrayList());
             }
        hash.get(nums[i]).add(i);
         }
         int min =Integer.MAX_VALUE;
for (List<Integer> list : hash.values()) {

    if (list.size() >= 3) {

        for (int i = 0; i <= list.size() - 3; i++) {

            min = Math.min(min,
                    2 * (list.get(i + 2) - list.get(i)));
        }
    }
}
 if ( min==Integer.MAX_VALUE){
     return -1;
 }
 return min;
    }
}