class Solution {
    public double countifyes( int[] dist , double hour, long mid ){
        double count=0;
        for( int i =0;i<dist.length-1;i++){
            count+=Math.ceil(((double)dist[i]/(double)mid));


        }
            count += (double) dist[dist.length - 1] / mid;
        return count;
    }
    public int minSpeedOnTime(int[] dist, double hour) {long low =1;
       long high = 10000000;
     
        long ans =-1;
          while(low<=high){
            long mid= low+( high - low)/2;
            double count = countifyes(dist,hour,mid);
            if (count<=hour ){
                ans=mid;
                high =mid-1;
            }
            else{
                low=mid+1;
            }
          }
        return(int) ans ;
    }
}