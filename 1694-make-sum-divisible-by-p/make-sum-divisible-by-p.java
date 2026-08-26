class Solution {
    public int minSubarray(int[] nums, int p) {
  int len = nums.length;
  
  long target=0;
  for(int i =0;i<len;i++){
    target+=nums[i];
  }
   int remm=(int)( target%p);
   if ( remm==0){
    return 0;
   }
   HashMap<Integer,Integer> mapp=new HashMap<>();
   mapp.put(0,-1);
   long curr=0;
   int minlen=Integer.MAX_VALUE;
   for( int i=0;i<len;i++){
    curr=(curr+nums[i])%p;
    int need=(int)(curr-remm+p)%p;
   if (mapp.containsKey(need)){
     minlen=Math.min(minlen,i-mapp.get(need));
   }
   mapp.put((int)curr,i);
   }
   return minlen==len?-1:minlen;
    }
}