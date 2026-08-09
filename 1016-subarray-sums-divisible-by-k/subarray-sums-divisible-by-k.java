class Solution {
    public int subarraysDivByK(int[] nums, int k) {
/*
        int cnt = 0;
        int n = nums.length;

        int prefix[] = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Subarray starting from index 0 and ending at 0
        if (prefix[0] % k == 0) {
            cnt++;
        }

        for (int i = 1; i < n; i++) {

            // Subarray [0...i]
            if (prefix[i] % k == 0) {
                cnt++;
            }

            int r = 0;

            // Subarray [r+1...i]
            while (r <= i - 1) {

                if ((prefix[i] - prefix[r]) % k == 0) {
                    cnt++;
                }

                r++;
            }
        }

        return cnt;*/

     
    HashMap< Integer,Integer> ans = new HashMap<>();
    ans.put(0,1);
    int n = nums.length;
    int count =0;
    int sum =0;
     for(int i =0; i<n ;i++){
         sum+= nums[i];
          int  rem=  sum%k;
             if (rem < 0) {
                rem += k;
            }
         if( ans .containsKey(rem)){
             count +=ans.get(rem);
             
         }
 
     ans.put(rem,ans.getOrDefault(rem,0)+1);
 
     }
      return count ;
 
    }
}