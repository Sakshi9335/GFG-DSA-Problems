class Solution {

    public int spanningTree(int V, int[][] edges) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }

        return primAlgo(adj);
    }

    public int primAlgo(ArrayList<ArrayList<int[]>> graph){

        boolean[] vis = new boolean[graph.size()];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        pq.add(new int[]{0,0}); // {vertex, weight}

        int cost = 0;

        while(!pq.isEmpty()){

            int[] curr = pq.remove();

            int v = curr[0];
            int wt = curr[1];

            if(!vis[v]){

                vis[v] = true;
                cost += wt;

                for(int[] e : graph.get(v)){

                    int dest = e[0];
                    int weight = e[1];

                    if(!vis[dest]){
                        pq.add(new int[]{dest,weight});
                    }
                }
            }
        }

        return cost;
    }
}