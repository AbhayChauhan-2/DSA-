class Solution {
    public boolean chech(int arr[],int arr2[]){
        for ( int i =0;i<arr.length;i++){
         
                if ( arr[i]!=arr2[i]){
                     return false;
                }
     
        }
         return true;
    }
    public boolean checkInclusion(String s1, String s2) {
         int s11=s1.length();
         int s22 =s2.length();
         int arr[]=new int[26];
         for( int i =0;i<s11;i++){
            char ch =s1.charAt(i);
            arr[ch-'a']++;
         }
         int left =0;
         int arr1[]=new int[26];
         for( int right=0;right<s22;right++){
            char ch = s2.charAt(right);
            arr1[ch-'a']++;
            while(right-left+1>s11){
                char chh =s2.charAt(left);
                arr1[chh-'a']--;
                left++;
            }
            if ( right- left +1==s11){
                if (chech(arr,arr1)== true){
                     return true ;
                }
            }

         }
        return false;
    }
}