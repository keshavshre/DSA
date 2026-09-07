/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node n=q.poll();
                res.add(n.data);
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
        }
        return res;
    }
}