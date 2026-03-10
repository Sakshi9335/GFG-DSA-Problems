// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int s = edges[i][0];
            int d = edges[i][1];
            graph.get(s).add(d);
            graph.get(d).add(s);
        }
        return graph;
        
    }
}