class Solution {
    public boolean isValid(String word) 
    {
       if(word.length()<3) {
        return false;
       }
       int vcount=0;
       int ccount=0;
       for(int i=0;i<word.length();i++)
       {
        char c=word.charAt(i);
        if(c=='@'||c=='#'||c=='$'){
            return false;
        }
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            vcount++;
        }
        if((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') &&
               !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
            ccount++;
        }
     

       }
           if(vcount>=1&&ccount>=1){
            return true;
        }
        else
           return false;
    }
}