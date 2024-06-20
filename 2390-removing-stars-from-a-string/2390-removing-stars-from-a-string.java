class Solution {
    public String removeStars(String s) {
        char[] result = new char[s.length()];
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (index > 0) {
                    index--; // Remove the previous character by moving the index back
                }
            } else {
                result[index] = c; // Add current character to result array
                index++;
            }
        }

        return new String(result, 0, index); // Create the final string up to the current index
    }


}
