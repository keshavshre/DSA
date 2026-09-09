/* Structure of a Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public int maxNodeLevel(Node root) {
        // code here
        if(root==null)return -1;
        int max=0;
        int level=0;
        int mlev=0;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            if(size>max){
                max=size;
                mlev=level;
            }
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            level++;
        }
        return mlev;
    }
}