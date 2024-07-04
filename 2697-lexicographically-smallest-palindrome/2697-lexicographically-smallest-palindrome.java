class Solution {
    public String makeSmallestPalindrome(String s) {
    char arr[]=s.toCharArray();
    int i=0;
    int j=arr.length-1;
    while(i<=j)
    {
        if(arr[i]!=arr[j])
        {
            if(arr[i]>arr[j])
            {
                arr[i]=arr[j];
            }
            else{
                 arr[j]=arr[i];
            }
        }
        i++;
        j--;
    }
    return new String(arr);
    }
}