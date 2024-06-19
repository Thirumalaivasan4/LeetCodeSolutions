class Solution {
    public int countDistinctIntegers(int[] arr) 
    {
        Set<Integer> ans=new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            ans.add(arr[i]);
            ans.add(rev(arr[i]));
        }
        return ans.size();

    }
    public static int  rev(int number)
    {
     int reverse = 0;  
     
     if(number <10){
        return number;
     }
     else{
        while(number != 0)   
            {  
           int remainder = number % 10;  
           reverse = reverse * 10 + remainder;  
           number = number/10;  
            } 
            return reverse; 
    }
    }
    
}