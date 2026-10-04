package Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondMaximum {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int sMax= Integer.MIN_VALUE;
        //calculate max
        for(int i=0; i<n; i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("Largest element of array : " + max);
        //calculate smax
        for(int i=0; i<n; i++){
            if(arr[i]>sMax && arr[i]<max ){
                sMax=arr[i];
            }
        }
        System.out.println("Second largest element of array : " + sMax);
    }
}
