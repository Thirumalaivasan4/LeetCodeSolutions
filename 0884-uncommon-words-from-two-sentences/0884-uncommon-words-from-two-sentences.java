class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
           HashSet<String> set=new HashSet<>();

           HashMap<String,Integer> map=new HashMap<>();

            for(String s:s1.split(" "))
            {
                map.put(s,map.getOrDefault(s,0)+1);
            }

           for(String s:s2.split(" "))
           {
                map.put(s,map.getOrDefault(s,0)+1);
           }
           
        for(String s:s1.split(" "))
        {
            if(map.get(s)==1)
            {
                set.add(s);
            }
        }
        for(String s:s2.split(" "))
        {
            if(map.get(s)==1)
            {
                set.add(s);
            }
        }
           
           return set.toArray(new String[0]);
    } 
}