class Solution {
    public String restoreString(String s, int[] indices) {
        String res="";
        char arr[]=new char [s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }
}