package Arrays;
import java.util.Scanner;

public class Solve {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Updated array : ");
        for(int i=0; i<n; i++){
            if(i%2 !=0){
                arr[i] *= 2;
            }else{
                arr[i] += 10;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
