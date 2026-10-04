package OOP;
class DynamicArray{ // user defined data structure
    int [] arr;
    int size = 0;
    int idx = 0;
    DynamicArray(){}
    DynamicArray(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length) { // array is full
            increaseCapacity();
        }
        arr[idx ++] = ele;
        size++;
    }
    void removeFromEnd(){
        idx--;
        size--;
    }
    void remove(){
        //body
    }
    void add(int index , int value){
        //body
    }
    void increaseCapacity(){
        int [] arr2 = new int[2* arr.length];
        for(int i=0; i< arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;//shallow copy
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index , int value){
        arr[index] = value;
    }
    void display(){
        for(int i =0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
public class OwnArrayList {
    static void main(String[] args) {
        DynamicArray arr = new DynamicArray(3);
        arr.add(10);arr.add(20);arr.add(30);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(40);arr.add(40);arr.add(40);arr.add(40);arr.add(40);
        arr.display();
        arr.removeFromEnd();
        arr.display();
    }
}
