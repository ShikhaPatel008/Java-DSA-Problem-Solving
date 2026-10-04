package Arrays;
import java.util.Scanner;

public class ProductOfElementOfArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr= new int [n];
        System.out.print("Enter elements of array : ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //product of element
        int product=1;
        System.out.print("Product of elements of array : ");
        for(int i=0; i<n; i++){
            product*= arr[i];
        }
        System.out.print(product);

    }
}
