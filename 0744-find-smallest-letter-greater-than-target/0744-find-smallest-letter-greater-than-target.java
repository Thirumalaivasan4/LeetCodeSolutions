class Solution {
    public char nextGreatestLetter(char[] arr, char k) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>k){
                return arr[i];
            }
        }
        return arr[0];
    }
}