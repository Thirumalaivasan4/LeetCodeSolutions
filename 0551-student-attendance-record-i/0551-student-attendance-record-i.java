class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")){
               return false;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)=='A'){
            count++;
        }
        if(count>1){
            return false;
        }
      
                 
       }
       return true;  
    }
}