class Solution {
    public String restoreString(String s, int[] indices) {
        String res="";
        int n=s.length();
        char arr[]=new char [n];

        for(int i=0;i<n;i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        String st= new String(arr);
        return st;
    }
}