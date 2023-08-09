class LinkedList{
	
Node head;

	class Node{
	int data;
	Node next;
	

	Node(int x){
		data = x;
		next = null;
	}
}

public Node insertNode(int data){

	//Calling the constructor with the passed argument to create a new Node
	Node newNode = new Node(data);


	

	return newNode;
}
}