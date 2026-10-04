package Arrays;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int [] arr= {10,20,30,40};
        int [] x= arr; // x is shallow copy of arr i.e. x is arr itself or x and arr point to same array in the memory
        x[0]=100;
        System.out.println(arr[0]);

        //Deep copy
        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 200;
        System.out.println(y[0]);
        System.out.println(arr[0]); //original array element does not change
    }
}
