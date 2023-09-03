package binary_search_tree;

public class DeleteNodeInBST {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static Node buildBinarySearchTree(Node root, int value){
           if (root == null){
               root = new Node(value);
               return root;
           }
           if (value<root.data){
               root.left = buildBinarySearchTree(root.left,value);
           }else {
               root.right = buildBinarySearchTree(root.right,value);
           }
           return root;
        }
        // searching inorder
        public static void searchInBST(Node root){
            if (root == null){
                return;
            }
            searchInBST(root.left);
            System.out.print(root.data+" ");
            searchInBST(root.right);
        }
        public static Node deleteNodeInBST(Node root, int value){
        if (root == null){
            return null;
        }
        if (value<root.data){
            root.left = deleteNodeInBST(root.left,value);
        } else if (value>root.data) {
            root.right = deleteNodeInBST(root.right,value);
        }
        else {
            // value == root.data
            // case 1: no child
            if (root.left ==null && root.right == null){
                return null;
            }
            // case 2: only one child
            if (root.left == null){
                return root.right;
            }
            if (root.right == null){
                return root.left;
            }
            // case 3 : inorder successor
            Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNodeInBST(root.right,value);
            }
        return root;
        }
        public static Node inorderSuccessor(Node root){
        while (root.left !=null){
            root = root.left;
        }
        return root;
        }

    public static void main(String[] args) {
        int[] nodes = {5,3,2,5,6,7,8};
        Node root = null;
        for (int i =0;i<nodes.length;i++){
           root = buildBinarySearchTree(root,nodes[i]);
        }
        searchInBST(root);
        deleteNodeInBST(root,5);
        System.out.println();
        searchInBST(root);
    }
}
