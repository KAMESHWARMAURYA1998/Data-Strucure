/**
	* @author Kameshwar Maurya
	*/
public class BinaryTreeExample {

				private TreeNode root;

				class TreeNode{
								private TreeNode next;
								private TreeNode prev;
								private int data;

								public TreeNode(int data){
												this.data = data;
								}

								public void createBinaryTree(){
												TreeNode first = new TreeNode(1);
												TreeNode second = new TreeNode(2);
												TreeNode third = new TreeNode(3);
												TreeNode fourth = new TreeNode(4);
												TreeNode fifth = new TreeNode(5);

												root = first;
												first.next = second;
												first.prev = third;

												second.next = fourth;
												second.prev = fifth;

								}

				}
}
