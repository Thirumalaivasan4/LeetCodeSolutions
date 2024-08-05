class Solution {
    public String kthDistinct(String[] arr, int k) {
     HashMap<String,Integer> map=new HashMap<>();
     
     for(int i=0;i<arr.length;i++)
     {
        String str= arr[i];
        if(map.containsKey(str)){
            map.put(str,map.get(str)+1);
            
        }
        else{
            map.put(str,1);
        }

     }
    String s="";
    int c=1;

    for(Map.Entry<String,Integer> entry:map.entrySet())
    {
        
        if(entry.getValue()==1&&c==k)
        {
            s=entry.getKey(); 
        }
        if(entry.getValue()==1)
        {
                c++;
        }
    } 
    return s; 
    }
}