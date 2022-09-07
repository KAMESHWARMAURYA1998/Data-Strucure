package TreePractice;

/**
	* @author Kameshwar Maurya
	*/
public class PreOrderTravarsal {

				TreeNode root;

				class TreeNode {

								int data;
								TreeNode next;
								TreeNode prev;

								TreeNode(int data) {
												this.data = data;
								}

				}
				public void createNode() {
								TreeNode t1 = new TreeNode(9);
								TreeNode t2 = new TreeNode(4);
								TreeNode t3 = new TreeNode(3);
								TreeNode t4 = new TreeNode(2);

								root = t1;
								t1.next = t2;
								t1.prev = t3;
								t2.next = t4;
				}

				public void preOrder(TreeNode root){
								if(root == null){
												return;
								}
								System.out.println(root.data);
								preOrder(root.prev);
								preOrder(root.next);
				}

				public static void main(String[] args){

PreOrderTravarsal bt = new PreOrderTravarsal();
bt.createNode();
bt.preOrder(bt.root);
				}

}
