class Solution {
    public String kthDistinct(String[] arr, int k) {
     HashMap<String,Integer> map=new HashMap<>();
     
     for(int i=0;i<arr.length;i++)
     {  

        String str= arr[i];
        if(map.containsKey(str))
        {
            map.put(str,map.get(str)+1);
        }
        else
        {
            map.put(str,1);
        }
      
     }
    System.out.println(map);
    for(String s:arr){
        if(map.get(s)==1){
            if(k==1)
             return s;
            k--;
        }
    }
    return "";
    }
}