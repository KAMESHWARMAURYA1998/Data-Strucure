package binary_search_tree;

public class PrintInRange {
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

    public static Node printInRange(Node root, int X, int Y){
        if (root == null){
            return null;
        }
        if (root.data>=X && root.data <=Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data+" ");
            printInRange(root.right,X,Y);
        } else if (root.data > X) {
            printInRange(root.left,X,Y);
        }
        else {
            printInRange(root.right,X,Y);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i =0;i<nodes.length;i++){
            root = buildBinarySearchTree(root,nodes[i]);
        }
        printInRange(root,6,10);
    }
}
