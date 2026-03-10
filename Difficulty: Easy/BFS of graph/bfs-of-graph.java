class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
         int v = adj.size();
        boolean vis[] = new boolean[v];
        
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            ans.add(curr);
            
            for(int i = 0; i < adj.get(curr).size(); i++) {
                int neigh = adj.get(curr).get(i);
                
                if(!vis[neigh]) {
                    vis[neigh] = true;
                    q.add(neigh);
                }
            }
        }
        
        return ans;
    }
}