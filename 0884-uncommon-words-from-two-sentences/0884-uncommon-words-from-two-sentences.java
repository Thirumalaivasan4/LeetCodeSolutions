class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
           HashSet<String> set=new HashSet<>();
           HashSet<String> copy=new HashSet<>();
           for(String s:s1.split(" "))
           {
               if(set.contains(s))
            {
                    set.remove(s);
                  }
                  else{
                      set.add(s);
                  }
                  copy.add(s);
           } 
           for(String s:s2.split(" "))
           {
            if(set.contains(s))
            {
                    set.remove(s);
            }
            if(copy.contains(s))
            {
                set.remove(s);
            }
            else{
                      set.add(s);
            }
           } 
           String str[]=new String[set.size()];
           int i=0;
           for(String a:set){
               str[i++]=a;
           }
           return str;
    } 
}