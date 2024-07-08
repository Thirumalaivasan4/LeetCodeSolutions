class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) 
    {
       
        //int m=arr2.length;
        int p1 = m - 1; // Pointer to the end of arr1
        int p2 = n - 1; // Pointer to the end of arr2
        int p3 = m + n - 1; // Pointer to the end of the merged array
        while(p1>=0&&p2>=0){
            if(arr1[p1]>arr2[p2])
            {
                arr1[p3]=arr1[p1];
                p1--;
            }
            else
            {
                arr1[p3]=arr2[p2];
                p2--;

            }
            p3--;
            
        }
        while(p2>=0)
        {
            arr1[p3]=arr2[p2];
            p3--;
            p2--;
        }

    
    }
}