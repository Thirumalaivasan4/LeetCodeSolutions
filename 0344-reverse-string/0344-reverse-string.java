class Solution {
    public void reverseString(char[] s) {
        int k=0;
        int i=s.length-1;
            while(k<=i){
                char temp=s[i];
                s[i]=s[k];
                s[k]=temp;
                 k++;
                 i--;
            }
        }
    }