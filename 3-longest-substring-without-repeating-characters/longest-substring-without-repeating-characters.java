class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
         int l = s.length();
    HashMap<Character,Integer>  sett= new HashMap<>();
  //    int freq=new int[256];
  int maxx =0;
          for( int i =0;i<l;i++){
            char ch = s.charAt(i);
            sett.put(ch,sett.getOrDefault(ch,0)+1);
            while ( sett.get(ch)>1){
                 char leftchar= s.charAt(left);
                    sett.put(leftchar,sett.get(leftchar)-1);
                     if ( sett.get(leftchar)==0){
                        sett.remove(leftchar);
                     

                }
                 left++;
            }
            maxx=Math.max(maxx,i-left+1);
          }
           return maxx;
        
    }
}