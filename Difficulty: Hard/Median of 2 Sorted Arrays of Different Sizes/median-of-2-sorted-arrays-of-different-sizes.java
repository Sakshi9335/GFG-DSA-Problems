class Solution {
    public double medianOf2(int a[], int b[]) {
        
         int n = a.length, m = b.length;
         int s = m+n;
        int[] temp = new int[s];
        int i = 0, j = 0, k = 0;

        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                temp[k] = a[i];
                i++;
            
            } else {
                temp[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            temp[k] = b[j];
            j++;
            k++;
        }

        
        if (s % 2 == 0) {
            int mid = s / 2;
            return (temp[mid] + temp[mid - 1]) / 2.0;
        } else {
            return temp[s/ 2];
        }
        
    }
}