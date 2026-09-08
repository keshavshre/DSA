/* Structure of Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public List<Integer> reverseLevelOrder(Node root) {
        // code here
        List<Integer>l=new ArrayList<>();
        if(root==null)return l;
        Queue<Node>q=new LinkedList<>();
        Stack<Node>st=new Stack<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            st.push(curr);
            if(curr.right!=null)q.offer(curr.right);
            if(curr.left!=null)q.offer(curr.left);
        }
        while(!st.isEmpty()){
            l.add(st.pop().data);
        }
        return l;
    }
}