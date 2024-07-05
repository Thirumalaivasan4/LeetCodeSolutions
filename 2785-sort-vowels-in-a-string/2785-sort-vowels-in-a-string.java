class Solution {
    public String sortVowels(String s) 
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

    char arr[]=s.toCharArray();

 ArrayList<Character> list=new ArrayList<>();
    for(int i=0;i<s.length();i++)
       {
        char c=arr[i];
        if(map.contains(c)){
            list.add(c);
            arr[i]='_';
        }
       } 
       Collections.sort(list);
       int j=0;
       for(int i=0;i<s.length();i++)
       {
           if(arr[i]=='_'){
           arr[i]=list.get(j++);
        }

       }
       return new String(arr);
    }
}