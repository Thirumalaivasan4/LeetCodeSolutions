class Solution {
    public String reverseVowels(String s) 
    {
        char arr[]=s.toCharArray();
        int n=arr.length;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char c=arr[i];
            if(isvowels(c))
            {
                 list.add(c);
                 arr[i]='+';
            }
        }
        int j=list.size()-1;
        for(int i=0;i<n;i++)
        {
            char c=arr[i];
            if(c=='+')
            {
              arr[i]=list.get(j--);  
            }
        }
        return new String(arr);
        
    }
     static boolean isvowels(char c)
    { 
        HashSet<Character> map =new HashSet<Character>();
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');
        map.add('A');
        map.add('E');
        map.add('I');
        map.add('O');
        map.add('U');
        return map.contains(c);
    }
}