class Solution {
    public int removeElement(int[] arr, int key) 
    {  int n=arr.length;
       int i=0;
       int j=n-1;
       while(i<=j)
       {
       if(arr[i]==key && arr[j]!=key){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
       }
       if(arr[j]==key){
          j--;
       }
       if(arr[i]!=key){
          i++;
       }
       }
       return i;
          
    }
    }