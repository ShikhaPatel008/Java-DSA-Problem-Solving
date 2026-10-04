package Arrays;

public class PassingArrayToMethods {
    static void main(String[] args) {
        int[] x= {20,3,45,65,38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[]y){
        y[2]=95; // the array is passed by reference therefore the value of element is updated
    }
}
