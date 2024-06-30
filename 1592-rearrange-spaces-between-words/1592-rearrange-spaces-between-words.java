class Solution {
    public String reorderSpaces(String text) {
        String ans = "";
        String arr[] = text.trim().split("\\s+");
        int word_count = arr.length;
        int space_count = 0;
        
        // Count the number of spaces in the input text
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                space_count++;
            }
        }
        
        // Handle case where there is only one word
        if (word_count == 1) {
            ans = arr[0];
            while (space_count > 0) {
                ans += " ";
                space_count--;
            }
            return ans;
        }
        
        int bp = space_count / (word_count - 1);
        int remaining_spaces = space_count % (word_count - 1);
        
        ans = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < bp; j++) {
                ans += " ";
            }
            ans += arr[i];
        }
        
        // Add remaining spaces at the end
        while (remaining_spaces > 0) {
            ans += " ";
            remaining_spaces--;
        }
        
        return ans;
    }
}
