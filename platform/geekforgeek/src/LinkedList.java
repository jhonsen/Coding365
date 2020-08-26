public class LinkedList {
    Node head;
    
    public static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public void printList() {
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    
    public static void main(String[] args){
        LinkedList linklist = new LinkedList();
        
        linklist.head = new Node(1);
        
        Node second = new Node(2);
        Node third = new Node(3);
        
        linklist.head.next = second;
        second.next = third;
        
        linklist.printList();
    }
    
}