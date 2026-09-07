/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer>res=new ArrayList<>();
        func(root,res);
        return res;
    }
    public void func(Node root,ArrayList<Integer>res){
        if(root==null)return;
        res.add(root.data);
        func(root.left,res);
        func(root.right,res);
    }
}