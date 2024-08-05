class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
           HashSet<String> set=new HashSet<>();

           HashMap<String,Integer> map1=new HashMap<>();
            for(String s:s1.split(" "))
            {
                map1.put(s,map1.getOrDefault(s,0)+1);
            }

           HashMap<String,Integer> map2=new HashMap<>();
           for(String s:s2.split(" "))
           {
                map2.put(s,map2.getOrDefault(s,0)+1);
           }

        for(String s:map1.keySet())
        {
            if(!map2.containsKey(s)&&map1.get(s)==1)
            {
                set.add(s);
            }
        }
        for(String s:map2.keySet())
        {
            if(!map1.containsKey(s)&&map2.get(s)==1)
            {
                set.add(s);
            }
        }
           String str[]=new String[set.size()];
           int i=0;
           for(String a:set)
           {
               str[i++]=a;
           }
           return str;
    } 
}