class Solution {
    public String kthDistinct(String[] arr, int k) {
     HashMap<String,Integer> map=new LinkedHashMap<>();
     int c=1;
     for(int i=0;i<arr.length;i++)
     {
        String str= arr[i];
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);

     }
    String s="";

    for(Map.Entry<String,Integer> entry:map.entrySet())
    {
        if(entry.getValue()==1)
        {

        if(c==k)
        {
            s=entry.getKey();
            return s;

        }

  c++;
        }
        
    } 

    return s; 
    }
}