class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>();
      
        for( int i=0;i<numCourses;i++ ){
            ans.add( new ArrayList<>());
            
        }
         for( int i =0;i<prerequisites.length;i++){
              ans.get(prerequisites[i][1]).add(prerequisites[i][0]);
         }
         int[] freq= new int[numCourses];
          for( int i =0;i<numCourses;i++){
            for( int num:ans.get(i)){
                freq[num]++;
            }
            

          }
          Queue<Integer> queue= new LinkedList<>();

          for( int i=0;i<numCourses;i++ ){
             if ( freq[i]==0){
                queue.add(i);
             }            
          }
           int count =0;
           
                while(!queue.isEmpty()){
                    count++;
                    int number = queue.poll();
                     for( int num:ans.get(number)){
                        freq[num]--;
                         if ( freq[num]==0){
                            queue.add(num);
                         }
                     }

                }
           
        return count==numCourses; 
    } 
}