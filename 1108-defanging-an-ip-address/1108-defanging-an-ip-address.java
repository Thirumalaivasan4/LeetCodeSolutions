class Solution {
    public String defangIPaddr(String st) {
        String s="";
     for(int i=0;i<st.length();i++)
     {
       if(st.charAt(i)=='.'){
         s=s+'[';
         s=s+st.charAt(i);
         s=s+']';
         continue;
       }
       s=s+st.charAt(i);
     }  
     return s; 
    }
}