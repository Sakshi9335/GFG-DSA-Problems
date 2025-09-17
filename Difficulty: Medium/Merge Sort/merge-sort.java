class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l>=r){
            return ;
        }
            int mid = l+(r-l)/2;
            mergeSort(arr  ,l,mid);
            mergeSort(arr  ,mid+1, r);
            merge(arr, l,mid,r);
        
    }
    void merge(int arr[], int l, int mid,int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i =l,j = mid+1;
        while(i <= mid && j <= r){
            if (arr[i]<= arr[j]){
                temp.add(arr[i++]);
                
            }
            else {
                temp.add(arr[j++]);
            }
        }
        while(i<=mid){
            temp.add(arr[i++]);
        }
        while(j<=r){
            temp.add(arr[j++]);
        }
        for (int k =l;k<=r;k++){
             arr[k] = temp.get(k - l);
        }
    }
}