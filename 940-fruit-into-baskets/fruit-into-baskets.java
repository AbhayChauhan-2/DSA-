class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
         int max =0;
        HashMap<Integer,Integer> mapp = new HashMap<>();
int left=0;
        for( int right=0; right<n;right++){
            mapp.put(fruits[right],mapp.getOrDefault(fruits[right],0)+1);
             while( mapp.size()> 2){
                
                 mapp.put(fruits[left],mapp.get(fruits[left])-1);
                
                
                   if ( mapp.get(fruits[left])==0) { 
                    mapp.remove(fruits[left]);
                   
                  }
                   left++;

             }
             
                max = Math.max( max , right-left+1);
              

        }
         return max;
    }
}