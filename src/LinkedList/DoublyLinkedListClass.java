package LinkedList;

class ListNode{ // user defined datatype - doubly linked list node
    int val;
    ListNode next; // null
    ListNode prev; // null
    ListNode(int val){
        this.val = val;
    }
}
class DLL{ // user defined data structure
    ListNode head;
    ListNode tail;
    int size;
    void addAtHead(int val){
        ListNode temp = new ListNode(val);
        // list is empty
        if(head == null) head = tail = temp;
        else{
            temp .next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val) {
        ListNode temp = new ListNode(val);
        // list is empty
        if(head == null) head = tail = temp;
        else{
            tail .next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("Cannot delete. List is empty");
            return;
        }
        else if(head.next == null) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(head == null){
            System.out.println("Cannot delete. List is empty");
            return;
        }
        else if(head.next == null) head = tail = null;
        else{
            tail =tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insert (int val , int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid index!!");
            return;
        }
        if(idx == 0){
            addAtHead(val);
            return;
        }
        if(idx == size){
            addAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i = 1; i<= idx - 1; i++){
            temp = temp.next;
        }
        a.next = temp.next;
        a.prev = temp;
        temp.next = a;
        a.next.prev  = a;
        size++;
    }
    void delete(int idx) {
        if(idx < 0 || idx > size){
            System.out.println("Invalid index!!");
            return;
        }
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i = 1; i<= idx -1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.prev.prev = temp;
        size--;
    }
}
public class DoublyLinkedListClass {
    static void main(String[] args) {
        DLL list = new DLL();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(40);
        list.display();
        list.addAtTail(40);
        list.display();
        list.displayReverse();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.insert(35, 2);
        list.display();
        list.delete(2);
        list.display();
    }
}
