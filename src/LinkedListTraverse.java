/**
 * author: zhanghongtao
 * date  : 2018-10-18 3:49 PM
 * email : zhtxcster@gmail.com
 */

public class LinkedListTraverse {

    public static void main(String []args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node h = head;

        System.out.println("Initial linked list");
        while(h != null) {
            System.out.print(h.getData());
            h = h.getNext();
        }

        System.out.println("\nReversed linked list");
        head = traverse(head);
        while(head != null) {
            System.out.print(head.getData());
            head = head.getNext();
        }

    }

    public static Node traverse (Node head) {

        if (head == null) {
            return head;
        }

        Node pre = head;
        Node cur = head.getNext();
        Node tmp;

        while(cur != null) {
            tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }

        head.setNext(null);
        return pre;

    }
}


