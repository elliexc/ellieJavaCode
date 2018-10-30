/**
 * author: zhanghongtao
 * date  : 2018-10-17 3:10 PM
 * email : zhtxcster@gmail.com
 */


public class LinkedListExample {

    public static void main(String []args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node h = head;
        while ( h != null) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }

        head = reverse(head);

        System.out.print("\n************************\n");

        while ( head != null) {
            System.out.print(head.getData()+ " ");
            head = head.getNext();
        }


    }

    public static Node reverse(Node head){

        if(head == null || head.getNext() == null) {
            return head;
        }

        Node rehead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return rehead;
    }
}


class Node {
    private int data;
    private Node next;

    public Node (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}