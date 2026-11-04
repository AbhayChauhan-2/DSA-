class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n = isConnected.length;
           boolean visited[]=new boolean[n];
           int cnt =0;
            for( int i =0;i<n;i++){
                 if ( visited[i]==false){
                    cnt++;
                    visited[i]=true;
                    dfs(i,isConnected,visited);
                 }

            }
       return cnt;  
    }
    public void dfs( int node ,int [][]isConnected,boolean visited[]){
        visited[node]= true;
         for ( int i =0;i<isConnected.length;i++){
             if (  isConnected[node][i]==1 && !visited[i]){
                 dfs(  i,isConnected,visited);
             }
         }
    }
}