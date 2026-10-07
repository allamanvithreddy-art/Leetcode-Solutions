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
    ArrayList<Integer> arr=new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
        int    diff=arr.get(i)-arr.get(i-1);
            ans=Math.min(ans,diff);
        }
        return ans;
    }
    public TreeNode inOrder(TreeNode root){
        if(root==null){
            return null;
        }
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
        return root;
    }
}