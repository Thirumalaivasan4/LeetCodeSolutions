class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : word.toCharArray()) 
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);

        TreeMap<Integer, List<Character>> sortedMap = new TreeMap<>(Collections.reverseOrder());
		// Sorting Characters by Frequency (sortedMap)
        for (char c : charFreq.keySet()) {
            int freq = charFreq.get(c);
            sortedMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(c);
        }

        int pushes = 0, count = 0;
        for (Map.Entry<Integer, List<Character>> entry : sortedMap.entrySet()) {
            List<Character> chars = entry.getValue();
            int freq = entry.getKey();
            for (int i = 0; i < chars.size(); i++) {
                count++;
                pushes += freq * (count > 24 ? 4: (count > 16 ? 3:(count > 8  ? 2: 1))); 
            }
        }

        return pushes;
    }
}