class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        String o="";
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)==l.charAt(i)){
                o=o+f.charAt(i);
                }
            else{
                break;
            }
        }
        return o;
    }
}