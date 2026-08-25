class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
           int firstStart = points[0][0];
            int firstEnd = points[0][1];
            int cnt =1;

            for( int i=1;i<points.length;i++){

            int secondStart = points[i][0];
            int secondEnd = points[i][1];
            

             if (firstEnd>=secondStart ){
              //continue;
              firstEnd = Math.min(firstEnd, secondEnd);
             }
             else{
                cnt ++;
             firstStart =secondStart;
             firstEnd= secondEnd;


             }
            
            }
             return cnt;
        
    }
}