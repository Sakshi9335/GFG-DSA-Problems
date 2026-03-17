class Solution {
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        // code here
        Arrays.sort(arr);
         ArrayList<Integer>list=new ArrayList<>();
         solve(arr,0,list);
         return ans;
        
    }
    public void solve(int[]arr,int i, ArrayList<Integer>list)
    {
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        solve(arr,i+1,list);
        list.remove(list.size()-1);
        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        solve(arr,i+1,list);
    }
}
