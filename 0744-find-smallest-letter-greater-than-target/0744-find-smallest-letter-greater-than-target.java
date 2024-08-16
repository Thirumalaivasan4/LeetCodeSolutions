class Solution {
    public char nextGreatestLetter(char[] arr, char k) 
    {
        //ceil of a number.
       
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
                int m=s+((e-s)/2);
                 if(arr[m]<k)
                 {
                    e=m-1;
                  }
                  else{
                    s=m+1;
                  }
        }
        return arr[e%arr.length];
        
    }
}