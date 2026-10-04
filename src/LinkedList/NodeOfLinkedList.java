package LinkedList;

public class NodeOfLinkedList {
    static void main(String[] args) {
        // 10 -> 20 -> 30 -> 40 -> 50
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        System.out.println(a.next);
        //connect karenge (Link karege)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null; // not required since it is already null by default
        System.out.println(a); // reference of a
        System.out.println(b); // reference of b
        System.out.println(a.next); // reference of b
        System.out.println(c); // reference of c
        System.out.println(b.next); // reference of c
        System.out.println(a.next.next); // reference of c
        System.out.println(a.next.next.val); // value of c
    }
}
