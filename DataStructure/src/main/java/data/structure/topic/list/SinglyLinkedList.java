package data.structure.topic.list;

/**
	* @author Kameshwar Maurya
	*/
public class SinglyLinkedList {

				private ListNode head;

				public static class ListNode{
						private int data;
						private ListNode next;

						public ListNode(int data){
										this.data = data;
										this.next = null;
						}
				}

				// display the element of the singly linked list
public void display() {
				ListNode current = head;
				while (current != null) {
								System.out.println(current.data);
								current = current.next;
				}
}

								// get the length of the singly linked list
public int getLengthSinglyLinkedList(){
						int count = 0;
						ListNode current = head;
						while(current !=null)
						{
							count++;
							current = current.next;
						}
						return count;
}
				public static void main(String[] args) {
								SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
								singlyLinkedList.head = new ListNode(10);
								ListNode first = new ListNode(1);
								ListNode second = new ListNode(8);
								ListNode third = new ListNode(5);


								singlyLinkedList.head.next = first;
								first.next= second;
								second.next = third;

								singlyLinkedList.display();
								int length = singlyLinkedList.getLengthSinglyLinkedList();
								System.out.println("length :"+length);

				}
}
