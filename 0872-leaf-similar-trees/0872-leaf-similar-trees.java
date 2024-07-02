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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> list1 =new ArrayList<Integer>();
        inorder(root1,list1);
        ArrayList<Integer> list2 =new ArrayList<Integer>();
        inorder(root2,list2);
          

        if(list1.size()!=list2.size())
        {
            return false;
        }
        else
        {
          return list1.equals(list2);
        }
       
        }      
    

     static void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;   
        }
        if(root.left==null&&root.right==null){
         list.add(root.val);
        }
        inorder(root.left,list);
        inorder(root.right,list);
     }

}