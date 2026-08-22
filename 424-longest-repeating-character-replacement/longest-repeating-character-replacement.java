class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
     
        HashMap<Character,Integer> use=new HashMap<>();
int maxx =Integer.MIN_VALUE;
int maxxy =0;
        for( int i =0;i<s.length();i++){
            char ch = s.charAt(i);
           
          
           use.put( ch,use.getOrDefault(ch,0)+1);

         maxxy=Math.max(maxxy,use.get(ch));
       //maxxy=Collections.max(use.values());
if((i-left+1)-maxxy>k){
            char pk=s.charAt(left);
             use.put(pk,use.get(pk)-1);
           
            if ( use.get(pk)==0){
                use.remove(pk);
            }

       left++;
       //maxxy=Collections.max(use.values());
      // maxxy=Math.max(maxxy,cz);

        }
        
        maxx=Math.max(maxx,i-left+1);}
        return maxx;
    }
}