class Solution {
    public int lengthOfLastWord(String s) {
        String ar[]=s.split(" ");
        return ar[(ar.length-1)].length();
    }
}