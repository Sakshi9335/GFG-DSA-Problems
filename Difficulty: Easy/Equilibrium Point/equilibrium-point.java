class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int leftSum = 0;
        int totalSum = 0;
        int n = arr.length ;
        for (int i =0;i<n;i++){
            totalSum += arr[i];
        }
        for(int i = 0;i<n; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum){
                return i;
            }
            else{
                leftSum += arr[i];
            }
        }
        return -1;
    }
}
