class Solution {
    public String reverseOnlyLetters(String s) {
       char arr[]=s.toCharArray();
       int i=0;
       Set<Character> map=new  HashSet<Character>(); 
       for (char c = 'a'; c <= 'z'; c++) {
            map.add(c);    
       }
        for (char c = 'A'; c <= 'Z'; c++) {
            map.add(c);
        }
       int j=arr.length-1;
       while(i<=j)
       {
           if(map.contains(arr[i])&&map.contains(arr[j]))
           {
              char temp=arr[i];
              arr[i++]=arr[j];
              arr[j--]=temp;
           }
           else if(!map.contains(arr[i])){
            i++;
           }
            else if(!map.contains(arr[j])){
            j--;
           }
       }
       return new String(arr);
    }
}