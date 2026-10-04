package LinkedList;

import java.util.Scanner;

public class DisplayLinkedList {
    public static void display(Node head) {
        Node temp = head; // temp also points to reference of head
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        //for(Node temp = head; temp != null; temp = temp.next){
        //  System.out.print(temp.val + " ");
        //}
        System.out.println();
    }
    // recursive display method
    public static void displayRec(Node head){
        if(head == null) return; // basecase
        System.out.print(head.val + " ");
        displayRec(head.next);
    }
    // get method
    public static int get(Node head , int idx){
        Node temp = head;
        for(int i =1; i<= idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node a = new Node(12); // head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(x);  // user input value of node d
        //connect karenge (Link karege)
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        System.out.println(get(a,2));
    }
}
