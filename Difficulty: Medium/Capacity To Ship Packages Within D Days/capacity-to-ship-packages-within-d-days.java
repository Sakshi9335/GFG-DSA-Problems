// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int totalsum =0, max =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ )
        {
            max = Math.max(max,arr[i]);
            totalsum += arr[i];
        }
        int low = max,high = totalsum, ans = totalsum;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(day(mid,arr)<=d)
            {
                high = mid-1;
                ans=mid;
            }
            else
            {
               low = mid+1;
            }
        }
       return ans;
    }
    public static int day(int capacity, int[]arr)
    {
     int d =0;
      int c = capacity;
      for(int i : arr){
        if(c>=i)
        c -= i;
        else
        {
            d++;
            c= capacity-i;
        }
      }
      d++;
      return d;
    }
    
};