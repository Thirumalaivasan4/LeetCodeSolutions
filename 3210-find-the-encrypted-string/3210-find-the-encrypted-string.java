class Solution {
    public String getEncryptedString(String s, int k) {
      String st="";
      int n=s.length();
      for(int i=0;i<s.length();i++){
        st+=s.charAt((i+k)%n);
      }  
      return st;
    }
}   