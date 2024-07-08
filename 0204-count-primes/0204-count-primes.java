class Solution {
    public int countPrimes(int n) {
        int CP=0;
              boolean[] bool = new boolean[n];  
       
      for (int i = 0; i< bool.length; i++) {  
         bool[i] = true;  
      }  
      for (int i = 2; i< Math.sqrt(n); i++) {  
         if(bool[i] == true) {  
            for(int j = (i*i); j<n; j = j+i) {  
               bool[j] = false;  
            }  
         }  
      }  

      for (int i = 2; i< bool.length; i++) {  
         if(bool[i]==true) {  
            CP++;
         }  
      } 
      return CP; 
        }
    }