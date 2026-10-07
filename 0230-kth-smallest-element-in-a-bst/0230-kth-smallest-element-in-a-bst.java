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
    ArrayList<Integer> m=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);

        int arr[]=new int[m.size()];
        for(int i=0;i<m.size();i++){
            arr[i]=m.get(i);
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    public TreeNode inOrder(TreeNode root){
        if(root==null){
            return null;
        }
       inOrder(root.left);
        m.add(root.val);
        inOrder(root.right);
        return root;
    }
}