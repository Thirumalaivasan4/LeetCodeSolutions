public class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return calculateMinCost(n - 1, colors, neededTime, dp, 'A', neededTime[n - 1]);
    }

    private int calculateMinCost(int i, String colorSequence, int[] timeRequired, int[] memo, char previousColor, int previousTime) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        char currentColor = colorSequence.charAt(i);
        int currentTime = timeRequired[i];
        if (currentColor == previousColor) {
            memo[i] = calculateMinCost(i - 1, colorSequence, timeRequired, memo, currentColor, Math.max(currentTime, previousTime)) + Math.min(currentTime, previousTime);
        } else {
            memo[i] = calculateMinCost(i - 1, colorSequence, timeRequired, memo, currentColor, currentTime);
        }
        return memo[i];
    }
}