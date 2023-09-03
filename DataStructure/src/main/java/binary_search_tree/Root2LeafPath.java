package binary_search_tree;

import java.util.ArrayList;

public class Root2LeafPath {

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

    public static void printRoot2LeafPath(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }else {
            printRoot2LeafPath(root.left,path);
            printRoot2LeafPath(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i =0 ; i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i =0;i<nodes.length;i++){
            root = buildBinarySearchTree(root,nodes[i]);
        }
        printRoot2LeafPath(root,new ArrayList<>());
    }
}
