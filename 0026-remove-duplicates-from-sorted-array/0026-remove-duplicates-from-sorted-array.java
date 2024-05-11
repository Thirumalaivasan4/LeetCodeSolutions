class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int ans = n;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == temp) {
                arr[i] = 10000;
                ans--;
            } else {
                temp = arr[i];
            }
        }

        int k = 1;
        int j = k;
        while (j < n && k < n) {
            if (arr[k] == 10000 && arr[k - 1] != 10000) {
                if (arr[j] != 10000 && arr[j - 1] == 10000) {
                    int t = arr[k];
                    arr[k] = arr[j];
                    arr[j] = t;
                } else {
                    j++;
                }
            } else {
                k++;
            }
        }
        return ans;

    }
}