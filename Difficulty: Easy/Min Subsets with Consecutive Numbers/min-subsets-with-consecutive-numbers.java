// User function Template for Java

class Solution {
    public int numOfSubset(int[] arr) {
        Arrays.sort(arr);
        int ans =1;
        for(int i =1; i<arr.length;i++){
            if(arr[i]-arr[i-1]!= 1){
                ans++;
            }
        }
        return ans;
    }
}