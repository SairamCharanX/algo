public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int data) {
        Node newNode = new Node(data);
    }

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //Methods for LinkedList operations

    //Append
    public void appendNode(int data) {
        
    }
}
