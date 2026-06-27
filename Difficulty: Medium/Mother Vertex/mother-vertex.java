class Solution {
    
    ArrayList<Integer>list=new ArrayList<>();
    public int findMotherVertex(int V, int[][] edges) {
        // code here
    
         ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            graph.get(edges[i][0]).add(edges[i][1]);
        }
        
        boolean[] vis=new boolean[V];
       
        int last=-1;
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                topo(graph,vis,i);
                last=i;
            }
        }
         
        if(check(last,V,graph))
        return last;
        else 
        return -1;
    }
    
    public boolean check(int i,int V,ArrayList<ArrayList<Integer>>graph)
    {
         boolean[] vis=new boolean[V];
        Stack<Integer>st=new Stack<>();
    
      
        topo(graph,vis,i);
        
        for(int j=0;j<V;j++)
        {
            if(!vis[j])
            return false;
            
        }
        
        return true;
    }
    
    
     public void topo(ArrayList<ArrayList<Integer>>graph,boolean[] vis,int curr)
    {
        vis[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            
            if(!vis[x])
            {
                topo(graph,vis,x);
            }
        }
    }
}