class LinkedList{
	
Node head;

	class Node{
	int data;
	Node next;
	

	public Node(int x){
		this.data = x;
		this.next = null;
	}
}

public Node insertNode(int data){

	//Call constructor for a new Node
	Node newNode = new Node(data);


	

	return newNode;
}
}