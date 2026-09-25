import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
Stack <Integer> stack = new Stack();
int sum=0;
for( int i =0;i<heights.length;i++){
    while( !stack.isEmpty() && heights[stack.peek()]>=heights[i]){
        int index= stack.pop();
        int pse=stack.isEmpty()?-1:stack.peek();
        int area=heights[index]*(i-pse-1);
        sum=Math.max(sum,area);
    }
    stack.push(i);
}
while(!stack.isEmpty()){
    int nse=heights.length;
      int index=stack.pop();
     int pse=stack.isEmpty()?-1:stack.peek();
        int area=heights[index]*(nse-pse-1);
        sum=Math.max(sum,area);
}
return sum;
    }
}