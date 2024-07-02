class Solution {
    public String[] sortPeople(String[] ar, int[] arr) {
       for (int i = 0; i < arr.length-1; i++) {
            
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    String  temp2 = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp2;
                    
                }
            }
       }
        
            return ar;   
    }
}
