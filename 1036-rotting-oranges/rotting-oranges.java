// class Solution {
//     public int orangesRotting(int[][] grid) {
        
//     int m = grid.length;
//         int n = grid[0].length;
//         boolean visited[][]= new boolean[m][n];
//         int count =0;
//         Queue< int []> queue= new LinkedList<>();
//          for( int i =0;i<m;i++){
//             for( int j=0;j<n;j++){
//                 if ( grid[i][j]==2){
//                     queue.offer(new int[]{i,j});
//                     visited[i][j]=true;
//                 }
//             }
//          }
//           while (!queue.isEmpty()){
//             int size= queue.size();
//             boolean flag=false;
//             for( int k=0;k<size;k++){
//              int []arr = queue.poll();
//              int i=arr[0];
//              int j=arr[1];
//               if(i-1>=0 && grid[i-1][j]==1 && !visited[i-1][j] ){
//                   visited[i-1][j]=true;
//                   flag=true;
                
//                 queue.offer(new int[]{i-1,j});

//         } if(i+1<m && grid[i+1][j]==1 && !visited[i+1][j]){
//             visited[i+1][j]=true;
//         flag= true;
//                 queue.offer(new int[]{i+1,j});

//         } if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j-1]){
//            visited[i][j-1]=true;
//         flag= true;
//                 queue.offer(new int[]{i,j-1});

//         } if(j+1<n && grid[i][j+1]==1 && !visited[i][j+1]){
//             visited[i][j+1]=true;
//         flag= true;
//                        queue.offer(new int[]{i,j+1});

//         }
//             }
//             if ( flag){
//                 count++;
//             }
//           }
//           for( int i =0;i<m;i++){
//             for( int j=0;j<n;j++){
//                 if ( grid[i][j]==1 && !visited[i][j]){
//                      return -1;
//                 }
//             }
//          }
        
//           return count;
        
//     }
   
// }
class Solution {
    public int orangesRotting(int[][] grid) {
        
    int m = grid.length;
        int n = grid[0].length;
        
         Queue< int []> queue= new LinkedList<>();
        int count =0;
         for( int i =0;i<m;i++){
            for( int j=0;j<n;j++){
                if ( grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                   
                }
            }
         }
          while (!queue.isEmpty()){
            int size= queue.size();
            boolean flag=false;
            for( int k=0;k<size;k++){
             int []arr = queue.poll();
             int i=arr[0];
             int j=arr[1];
              if(i-1>=0 && grid[i-1][j]==1  ){
                  grid[i-1][j]=2;
                  flag=true;
                
                queue.offer(new int[]{i-1,j});

        } if(i+1<m && grid[i+1][j]==1){
            grid[i+1][j]=2;
        flag= true;
                queue.offer(new int[]{i+1,j});

        } if(j-1>=0 && grid[i][j-1]==1){
           grid[i][j-1]=2;
        flag= true;
                queue.offer(new int[]{i,j-1});

        } if(j+1<n && grid[i][j+1]==1 ){
            grid[i][j+1]=2;
        flag= true;
                       queue.offer(new int[]{i,j+1});

        }
            }
            if ( flag){
                count++;
            }
            // not needded but will break if no more rotting 
            else {
                 break;
            }
          }
          for( int i =0;i<m;i++){
            for( int j=0;j<n;j++){
                if ( grid[i][j]==1 ){
                     return -1;
                }
            }
         }
        
          return count;
        
    }
   
}