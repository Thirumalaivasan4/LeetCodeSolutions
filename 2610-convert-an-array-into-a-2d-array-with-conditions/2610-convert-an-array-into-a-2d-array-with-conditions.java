class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            map.put(a, map.getOrDefault(a, 0) + 1);
        }



        out:
        while (true) 
        {
            List<Integer> val = new ArrayList<>();
            for (int i : map.keySet()) {
                int v = map.get(i);
                if (v > 0) {
                    val.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }
            
          
            
            if (val.isEmpty()) {
                break;
            }
            list.add(val);
            
        }
        return list;
    }
}
