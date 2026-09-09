class Solution {
    public int numberOfSubstrings(String s) {

        

        return atMost(s, 3) - atMost(s,2);
    }

    public int atMost(String s, int goal) {

        if (goal < 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int cnt = 0;
        int freq[]= new int[26];
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (freq[ch-'a']==0 ){
                sum++;
            }
            freq[ch-'a']++;


          

            while (sum> goal) {
                char th = s.charAt(left);
                   freq[th-'a']--;
                if ( freq[th-'a']==0){
                    sum--;
                }
             
                 
                left++;
            }

            cnt += right - left + 1;
        }

        return cnt;
 
    }
}