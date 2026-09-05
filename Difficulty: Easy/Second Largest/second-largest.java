class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int lr =-1;
        int sec =-1;
        for(int i=0;i<n;i++){
           if(lr<arr[i]){
               sec=lr;
               lr=arr[i];
           }
             else if(arr[i] > sec && arr[i] != lr) {
                  sec = arr[i];
              }
        }
       
        return sec;
    }
}