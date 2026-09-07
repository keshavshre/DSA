/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        func(root,res);
        return res;
    }
    public void func(Node root,ArrayList<Integer>res){
        if(root==null)return;
        func(root.left,res);
        func(root.right,res);
        res.add(root.data);
    }
}