package Arrays;

public class ArrayBasics {
    static void main(String[] args) {
        //declaration and initialization at same time
        int[] x = {6,19,7,69,171,5};
        //indexing
        System.out.println(x[4]);//access elements
        //updating elements - mutability(changing)
        x[3]=89;
        System.out.println(x[3]);
        //declaration then initialization
        int [] arr = new int [4]; //declared
        arr[0]= 10;
        arr[1]= 30;
        arr[2]= 5;
        arr[3]= -10;
    }
}
