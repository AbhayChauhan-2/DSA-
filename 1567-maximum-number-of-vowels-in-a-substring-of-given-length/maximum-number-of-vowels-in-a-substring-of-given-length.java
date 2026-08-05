class Solution {
    public int maxVowels(String s, int k) {
        int left =0;
        int cnt =0;
        int max =0;
       // StringBuilder sb = new StringBuilder();
        for( int right=0;right<s.length();right++){
            char ch= s.charAt(right);
             if ("aeiou".indexOf(ch)!=-1){
                cnt++;

             }
             while( right-left+1>k){
              
                char th =s.charAt(left);
                 if ("aeiou".indexOf(th)!=-1){
                    cnt--;
             }
             left++;
            
        }
         if (right-left+1 ==k){
          max = Math.max(max,cnt);
            
         }
        
    }
     return max;}
}