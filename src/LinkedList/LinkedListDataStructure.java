package LinkedList;

class Node{  // user defined data type
    int val; // value of current node
    Node next;// next node --- default value - null
    Node(int val){
        this.val = val;
    }
}

class Linked_List{ // user defined data structure
    Node head; // null
    Node tail; // null
    int size;

    Linked_List(){
        head = tail = null; // not really required
    }

    int search(int val){
        if(head == null) return -1; // element not found
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void display() {
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addToTail(int val) {

        Node temp = new Node(val);
//       empty linked list  --
//       way 1
//       if(head == null) {
//           head = tail = temp;
//       }

//        way 2 - using addAtHead() method--
        if(tail == null) {
            addAtHead(val);
            return;
        }
         else{
             tail.next = temp;
             tail = temp;
             size++;
         }




    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) { //empty linked list
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if(head == null){ // 0 size linked list
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;//  1 sized linked list
        size--;
    }

    void insert(int val, int idx){
        if(idx < 0 || idx> size){
            System.out.println("Invalid index!!");
        }
        else if(idx == 0) addAtHead(val);
        else if(idx == size) addToTail(val);
        else{
            Node temp = head;
            for(int i=1 ; i<=idx-1; i++){  //  for(int i=0 ; i<idx-1; i++)
                temp = temp.next;
            }
            Node t = new Node(val); // new node created
            t.next = temp.next;
            temp.next = t;
            size++;
        }

    }

    int get(int idx){
        if (idx < 0 || head == null) {
            return -1;
        }
        Node temp = head;
        for(int i=1; i<= idx; i++){
            if (temp == null) {
                return -1;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.val;
    }

    void delete(int idx){
        if(idx < 0 || idx >=size){
            System.out.println("Invalid index !!");
            return;
        }
        if(idx == 0){ // delete at head
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i =1; i<= idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size - 1) tail = temp; // we are deleting tail
        size--;
    }
}
public class LinkedListDataStructure {
    static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addToTail(10);
        ll.addToTail(20);
        ll.addToTail(30);
        ll.addToTail(40);
        ll.display();
        ll.addAtHead(5);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
        ll.insert(50,2);
        ll.display();
        System.out.println(ll.get(3));
        ll.delete(3);
        ll.display();
    }

}
