// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
    int[]dp = new int[arr.length+1];
    Arrays.fill(dp,-1);
    return solve(arr.length-1,dp,arr);
        
    }
    public int solve(int n, int[]dp,  int []arr){
        if(n==-1){
            return 0;
        }
        if(n==0){
            return arr[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick = arr[n]+solve(n-2,dp,arr);
        int nonpick = solve(n-1,dp,arr);
        return dp[n] =Math.max(pick,nonpick);
    }
}