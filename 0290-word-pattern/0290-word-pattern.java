import java.util.HashMap;

class Solution {
    public boolean wordPattern(String p, String s) {
        String arr[] = s.split(" ");
        
        if (p.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            String str = arr[i];
            
            // Check the character to string mapping
            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(str)) {
                    return false;
                }
            } else {
                map1.put(c, str);
            }
            
            // Check the string to character mapping
            if (map2.containsKey(str)) {
                if (!map2.get(str).equals(c)) {
                    return false;
                }
            } else {
                map2.put(str, c);
            }
        }
        return true;
    }
}
