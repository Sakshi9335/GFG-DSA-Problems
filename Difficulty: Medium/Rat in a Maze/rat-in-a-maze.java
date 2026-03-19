class Solution {
     ArrayList<String>ans=new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        boolean [][]vis=new boolean[n][n];
        solve(0,0,maze,n,ans,vis,"");
        return ans;
    }
    public void solve(int i, int j,int[][]maze,int n, ArrayList<String>ans,boolean[][]vis,String path){
        if(i<0||j<0||i>=n ||j>=n||maze[i][j]==0||vis[i][j]){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(path);
            return;
        }
        
        vis[i][j]=true;
         solve(i+1,j,maze,n,ans,vis,path+"D");
       solve(i,j-1,maze,n,ans,vis,path+"L");
      solve(i,j+1,maze,n,ans,vis,path+"R");
       solve(i-1,j,maze,n,ans,vis,path+"U");
        vis[i][j]=false;
        
    }
}