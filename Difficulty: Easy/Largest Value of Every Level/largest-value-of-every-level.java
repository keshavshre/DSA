/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                max=Math.max(max,curr.data);
                if(curr.right!=null)q.offer(curr.right);
                if(curr.left!=null)q.offer(curr.left);
            }
            res.add(max);
        }
        return res;
    }
}