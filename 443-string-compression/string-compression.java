class Solution {
    public int compress(char[] chars) {
        int n =chars.length;
        int cnt =0;
       // StringBuilder sb =new StringBuilder();
       // ArrayList<Character> sb = new ArrayList<>();
     //  String str="";
     int i =0;

     int index=0;
        while(i<n){
           // cnt ++;
            
            int j = i;
          
            while( j<n && chars[i]==chars[j]){
                cnt++;
                j++;
            }
            if (cnt<=1){
                 chars[index]=chars[i];
                 index++;}
                else {
                chars[index] = chars[i];
                index++;

                if (cnt < 10) {
                    chars[index] = (char) (cnt + '0');
                    index++;
                } else {
                    String str = String.valueOf(cnt);

                    for (int k = 0; k < str.length(); k++) {
                        chars[index] = str.charAt(k);
                        index++;
                    }
                }
            }
            i=j;
                cnt =0;

            
        }
         return index;
    }
}