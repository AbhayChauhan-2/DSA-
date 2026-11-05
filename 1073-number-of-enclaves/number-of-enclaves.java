class Solution {
    public int numEnclaves(int[][] grid) {
      int m = grid.length;
        int n = grid[0].length;
        boolean visited[][]= new boolean[m][n];
        int count =0;
         for( int i =0;i<m;i++){
            for( int j=0;j<n;j++){
                 if ( i==0 || i==m-1 || j==0||j==n-1 ){
                if ( grid[i][j]==1 && !visited[i][j] ){
                   
                    dfs(i,j,grid,visited);
                }
            }
            }

         }
          for( int i =0;i<m;i++){
            for( int j=0;j<n;j++){
            
                if ( grid[i][j]==1 && !visited[i][j] ){
                    count++;
                   // dfss(i,j,grid,visited,count);
                }
            }
         }
          return count;
        
    }
    public void dfs( int i ,int j , int [][]grid,boolean [][]visited){
        int m = grid.length;
        int n = grid[0].length;
        
        visited[i][j]=true;
        if(i-1>=0 && grid[i-1][j]==1 && !visited[i-1][j]){
            dfs(i-1,j,grid,visited);
        } if(i+1<m && grid[i+1][j]==1 && !visited[i+1][j]){
            dfs(i+1,j,grid,visited);
        } if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j-1]){
            dfs(i,j-1,grid,visited);
        } if(j+1<n && grid[i][j+1]==1 && !visited[i][j+1]){
            dfs(i,j+1,grid,visited);
        }
    }  
    
    
}