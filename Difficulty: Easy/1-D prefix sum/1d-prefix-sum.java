class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
         
         ans.add(arr[0]);
         
         for (int i =1;i<arr.length;i++){
              ans.add(ans.get(i - 1) + arr[i]); 
         }
         return ans;
    }
}