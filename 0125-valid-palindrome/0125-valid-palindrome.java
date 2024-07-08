class Solution {
    public boolean isPalindrome(String s)
     {  
        String str="";
            if( s.length()==1){
                return true;
            }
            for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (('a' <= c && c <= 'z') )
            {
                str = str + c;
            }
            else if ('A' <= c && c <= 'Z'){
                str = str +(char)(c+32);
            }
            else if('0'<= c && c <= '9'){
                   str = str + c;
            }
        }
       System.out.println(str);
       int n=str.length();
       int i=0;
       int j=n-1;
    
       while(i<=j)
       {
         if(str.charAt(i)!=str.charAt(j)){
            return false;
         }
         i++;
         j--;
       }
       return true;
     }
}