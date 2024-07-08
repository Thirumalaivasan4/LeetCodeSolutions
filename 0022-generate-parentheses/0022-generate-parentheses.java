class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> list=new  ArrayList<>();

     helper(n,n,list,"");
    return list;
    }
    static void   helper(int o,int c, List<String> list,String s)
    {
    if(o==0&&c==0)
    {
      list.add(s);
      return;
    }
    if(o>0)
    {
        helper(o-1,c,list,s+'(');
    }
    
    if(c>o){
          helper(o,c-1,list,s+')');
    }
    //return list;
    }
}