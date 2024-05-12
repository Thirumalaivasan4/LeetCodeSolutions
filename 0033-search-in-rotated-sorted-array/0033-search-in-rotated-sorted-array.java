class Solution {
    public int search(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            // If left part of the array is sorted and k is within that range
            else if (arr[s] <= arr[mid] && k >= arr[s] && k < arr[mid]) {
                e = mid - 1;
            }
            // If right part of the array is sorted and k is within that range
            else if (arr[mid] <= arr[e] && k > arr[mid] && k <= arr[e]) {
                s = mid + 1;
            }
            // If left part of the array is rotated and k is within that range
            else if (arr[s] > arr[mid]) {
                e = mid - 1;
            }
            // If right part of the array is rotated and k is within that range
            else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
