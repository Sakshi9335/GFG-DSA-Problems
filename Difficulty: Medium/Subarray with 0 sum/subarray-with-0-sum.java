class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int count = 0;
        int curr_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<arr.length;i++){
            curr_sum += arr[i];
            int c = curr_sum-0;
            if(map.containsKey(c))
            {
                count += map.get(c);
                return true;
            }
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }
        return false;
       
    }
}