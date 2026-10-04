package Arrays;
import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int found = -1; // -1 means target does not exist in array
        for (int i=0; i<n; i++){
            if (arr[i]==target){
                found = i; // any no. except -1 means target present in array
                break;
            }
        }
        if (found!= -1) System.out.println("Target found at index " + found);
        else System.out.println("Target missing in array");
    }
}
