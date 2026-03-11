class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
      }
        for(int i=0; i<edges.length;i++){
            int u= edges[i][0];
            int v= edges[i][1];
            adj.get(u).add(v);
            
        }
        
       boolean[]vis= new boolean[V];
        Stack<Integer>st= new Stack<>();
        for(int i=0; i<V;i++){
            if(vis[i]==false){
                topsort(adj,i,vis,st);
            }
        }
         ArrayList<Integer> ans = new ArrayList<>();

        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        return ans;
    }
    public void topsort( ArrayList<ArrayList<Integer>> adj,int curr,boolean[]vis,Stack<Integer>st)
    {
      vis[curr] = true;

        for(int neigh : adj.get(curr)){
            if(!vis[neigh]){
                topsort(adj,neigh,vis,st);
            }
        }

        st.push(curr);   
    }
}