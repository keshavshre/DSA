/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        func(res,root);
        return res;
    }
    public void func(ArrayList<Integer>res,Node root){
        if(root==null)return;
        func(res,root.left);
        res.add(root.data);
        func(res,root.right);
    }
}