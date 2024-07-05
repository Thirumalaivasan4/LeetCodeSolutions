class Solution {
    public int minimumPushes(String word) {
      if(word.length()<=8){
        return word.length();
      }  
      int q=word.length()/8;
      int r=word.length()%8;
      int ans=0;int i=0;
      for( i=1;i<=q;i++){
              ans+=8*i;
      }
      if(r==0){
        return ans;
      }
      else{
         return ans+r*i;
      }
    }
}