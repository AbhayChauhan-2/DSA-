class Solution {
    
    public boolean chech(int arr[],int arr2[]){
        for ( int i =0;i<arr.length;i++){
         
                if ( arr[i]!=arr2[i]){
                     return false;
                }
     
        }
         return true;
    }
    
        
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> result= new ArrayList<>();
         int s11=s.length();
         int s22 =p.length();
         int arr[]=new int[26];
         for( int i =0;i<s22;i++){
            char ch =p.charAt(i);
            arr[ch-'a']++;
         }
         int left =0;
         int arr1[]=new int[26];
         for( int right=0;right<s11;right++){
            char ch = s.charAt(right);
            arr1[ch-'a']++;
            while(right-left+1>s22){
                char chh =s.charAt(left);
                arr1[chh-'a']--;
                left++;
            }
            if ( right- left +1==s22){
                if (chech(arr,arr1)== true){
                     result.add(left);
                }
            }

         }
        return result;
    
    }
}