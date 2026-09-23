import java.util.*;

class Solution {

    public int sumSubarrayMins(int[] arr) {

   int n = arr.length;
   long mod = 1000000007;
   Stack<Integer> stack = new Stack<>();
   int[] left = new int[n];
   int[] right= new int[n];
    for( int i =n-1;i>=0;i--){
        while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
           stack.pop();

        }
        if(stack.isEmpty()){
            right[i]=n;

        }
        else{
            right[i]=stack.peek();
        }
        stack.push(i);
    }
     
    stack.clear();
     for( int i =0;i<n;i++){
        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
           stack.pop();

        }
        if(stack.isEmpty()){
            left[i]=-1;

        }
        else{
            left[i]=stack.peek();
        }
stack.push(i);

    }
    long sum=0;

     for( int i =0;i<n;i++){
        long lefti=i-left[i];
        long righti=right[i]-i;
        long con=(long)arr[i]*lefti*righti;

sum=(sum+con)%mod;
        


     }
      return (int)sum;
    }
}

