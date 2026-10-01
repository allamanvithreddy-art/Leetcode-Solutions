/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node> k=new LinkedList<>();
        k.offer(root);
        while(!k.isEmpty()){
            int qsize=k.size();
            for(int i=0;i<qsize;i++){
                Node curr=k.poll();
                if(i!=qsize-1){
                    curr.next=k.peek();
                }
            if(curr.left!=null){
                k.offer(curr.left);
            }
            if(curr.right!=null){
                k.offer(curr.right);
            }

            }
        }
        return root;
    }
 
}