package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printList(head);

    }

    static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}

