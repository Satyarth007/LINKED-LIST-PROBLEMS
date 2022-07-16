// NODE CLASS 
class Node{
	int data;     // NODE DATA
	Node next;	  // NODE REFERENCE PART
	
	public Node(int data, Node next) {
		this.data=data;
		this.next=next;
	}
	
}

public class LinkedList {
	
	static Node head=null;   // INITIALLY HEAD POINTS NO NODE i.e. NULL
//======================================================================================	
	// INSERTING NODE AT THE BEGINING-
	public static void insertBeg(int data) {
		Node newNode=new Node(data,null);
		
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
//======================================================================================	
		// INSERTING NODE AT THE END-
		public static void insertEnd(int data) {
			Node newNode=new Node(data,null);
	
			if(head==null) {
				head=newNode;
				return;
			}
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
//======================================================================================	
	//DISPLAYING ALL THE NODES-
	public static void display() {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print("[ "+temp.data+" ]--");
			temp=temp.next;
		}
	}
//======================================================================================
	//SORTED INSERT IN SLL
	public static void sortedInsert(int data) {
		Node newNode=new Node(data,null);
		
		Node curr = head;
		if (curr == null || curr.data> data) {
		   newNode.next = head;
		   head = newNode;
		   return;
		}
		while (curr.next != null && curr.next.data < data) {
		       curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		
		
	}
	public static void main(String[] args) {
		// MAIN METHOD TO PASS NODE VALUES 
		
		
		//insertBeg()- to insert at begining
			insertBeg(10);
			insertBeg(20);
			insertBeg(30);
			insertBeg(40);
			insertBeg(50);
			
		// display()- method to display our nodes of linked list	
			display();
			System.out.println();
		// insertEnd()- to insert node at the END
			insertEnd(60);
			insertEnd(70);
			insertEnd(80);
			insertEnd(90);
			insertEnd(100);
		
		// display()- method to display our nodes of linked list	
			display();
			System.out.println();
			
		//insertSorted
			sortedInsert(55);
			sortedInsert(0);
			sortedInsert(35);
			sortedInsert(105);
			
		// display()- method to display our nodes of linked list	
			display();	
					
	}

}
