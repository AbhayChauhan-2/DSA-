class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
   
         Arrays.sort(intervals,
            (a, b) -> Integer.compare(a[0], b[0]));
        
    

        int start = intervals[0][0];
        int end = intervals[0][1];
        int cnt =0;

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart < end) {
                   cnt ++;
                   end=Math.min(end,currentEnd);} 
         else {
          
           
                start = currentStart;
                end = currentEnd;
            }
        }

 
      return cnt ;

    }
}