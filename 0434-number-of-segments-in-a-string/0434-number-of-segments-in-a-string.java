class Solution {
    public int countSegments(String s) {
        if(s.trim().equals("")){
            return 0;
        }
        String arr[]=s.trim().split("\\s+");
        
        return arr.length;    
    }
}