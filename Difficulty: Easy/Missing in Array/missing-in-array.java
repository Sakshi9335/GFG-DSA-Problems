class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
      int n=arr.length;
      int start=1;
      for(int i=0;i<n;i++){
          if(arr[i]==start){
              start++;
          }
          else {
              return start;
          }
      }
      return start;
    }
}