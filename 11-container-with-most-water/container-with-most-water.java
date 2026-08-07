class Solution {
    public int maxArea(int[] height) {
         int i =0;
         int j =height.length-1;
         int minn=0;
         int maxxarea=0;
         while (i <j){
            minn=Math.min(height[i],height[j]);
            maxxarea = Math.max(maxxarea,(j-i)*minn);
            if (height[i]<height[j]){
                i++;
            }else{
             j--;}
         }
          return maxxarea;
        
    }
}