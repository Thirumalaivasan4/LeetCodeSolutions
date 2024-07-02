/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) 
    {     
          ArrayList<Integer> list=new  ArrayList<>();
          bfs(root,list);
          int ans=0;
          for(int i=list.size()-1;i>=0;i--){
           
            System.out.println("i"+list.get(i));
            if(list.get(i)!=-1){
             ans=ans+list.get(i);
            }
            if(list.get(i)==-1){
                break;
            }
            
           

          }
          return ans;   
    }
    static void bfs(TreeNode root,ArrayList<Integer> list)
    {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return;
        }
        else{
            q.offer(root);
            q.offer(null);
            while(q.size()>1){
               TreeNode p=q.peek() ;
               if(p==null){
                list.add(-1);
                q.remove();
                q.offer(null);
               }
               else{
                list.add(p.val);
                q.remove();
                if(p.left!=null){
                    q.offer(p.left);
                }
                 if(p.right!=null){
                    q.offer(p.right);
                }
               }
            }
        }
             
    }
}