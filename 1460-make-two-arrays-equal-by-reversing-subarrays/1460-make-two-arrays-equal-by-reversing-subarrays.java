class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length)
             return false;
       int ar[]=new int[1001];
       for(int i=0;i<target.length;i++){
        ar[target[i]]++;
        ar[arr[i]]--;
       }
       for(int i=0;i<1001;i++){
        if(ar[i]>0){
            return false;
        }
       }       
       return true;
        
    }
}