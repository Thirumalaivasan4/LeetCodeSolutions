class Solution {
    public String predictPartyVictory(String senate) 
    
    {
         Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();

        int n = senate.length();

        // Initialize queues with indexes of Radiant and Dire senators
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            // The senator with the smaller index bans the other senator
            if (rIndex < dIndex) {
                // Radiant senator bans the Dire senator and gets back in line
                radiant.offer(rIndex + n);
            } else {
                
                dire.offer(dIndex + n);
            }
        }

       
        return radiant.isEmpty() ? "Dire" : "Radiant";
    
    
    }
}