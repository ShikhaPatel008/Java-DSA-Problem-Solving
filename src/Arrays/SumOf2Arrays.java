package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOf2Arrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter elements of array1 : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array2 : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter elements of array2 : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int carry= 0, i= n-1, j= m-1;


        //add digits from end
        while(i>=0 || j>=0 || carry !=0){
            int sum=carry;
            if(i>=0){
                sum+= arr1[i];
                i--;
            }
            if(j>=0){
                sum+= arr2[j];
                j--;
            }
            ans.add(sum%10);
            carry= sum/10;
        }
        Collections.reverse(ans);
        System.out.println("Sum of 2 array  : "+ ans);
    }
}
