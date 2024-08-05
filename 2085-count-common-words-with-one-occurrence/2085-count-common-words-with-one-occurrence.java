class Solution {
    public int countWords(String[] words1, String[] words2) {
         LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
       
        for(int i=0; i<words1.length; i++){
           map1.put(words1[i],map1.getOrDefault(words1[i],0)+1);
        }
         LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
       
        for(int i=0; i<words2.length; i++){
           map2.put(words2[i],map2.getOrDefault(words2[i],0)+1);
        }
        int a=0;
    
        for(String s:map1.keySet()){
            if((map1.get(s)==1)&&(map2.containsKey(s))&&(map2.get(s)==1)){
                a++;
            }
        }
        return a;

    }
}