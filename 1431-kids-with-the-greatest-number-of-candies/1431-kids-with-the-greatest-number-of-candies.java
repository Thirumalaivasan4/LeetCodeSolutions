class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        for (int num : candies) {
            max = Math.max(max, num);
        }

        List<Boolean> result = new ArrayList<>();

        for (int num : candies) {
            if (num + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}