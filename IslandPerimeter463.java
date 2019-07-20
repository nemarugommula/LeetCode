class Solution {
    int answer=0;
    public int islandPerimeter(int[][] grid) {
        
        int perimeter=0;
            int [][]visited = new int[grid.length][grid[0].length];

        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            visited[i][j]=0;
            
            }}
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               
                DFS(grid,visited,i,j);
                
            }
      
        }
      return answer;
    }
    public void DFS(int [][]grid,int [][]visited,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0||visited[i][j]==1){
            return ;
        }
        int count=0;
        count+=4;
        if(grid[i][j]==1){
        if((i+1)<(grid.length)&&(i+1)>=0&&visited[i+1][j]==1){
        count-=2;     
        }
        if((i-1)<(grid.length)&&(i-1)>=0&&visited[i-1][j]==1){
        count-=2;     
        }
        if((j+1)<(grid[0].length)&&(j+1)>=0&&visited[i][j+1]==1){
        count-=2;     
        }
        if((j-1)<(grid[0].length)&&(j-1)>=0&&visited[i][j-1]==1){
        count-=2;     
        }
        }
        visited[i][j]=1;

        answer+=count;
        DFS(grid,visited,i+1,j);
        DFS(grid,visited,i-1,j);
        DFS(grid,visited,i,j+1);
        DFS(grid,visited,i,j-1);
                
    }
}