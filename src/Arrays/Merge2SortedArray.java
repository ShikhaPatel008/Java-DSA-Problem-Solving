package Arrays;

import java.util.Scanner;

public class Merge2SortedArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter sorted elements of array1 : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array2 : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter sorted elements of array2 : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int [] arr= new int[n+m];
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("Combined(merged) sorted array : ");
        merge(arr,arr1,arr2);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }

    static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]= arr1[i];
                i++;
            }
            else{
                arr[k]= arr2[j];
                j++;
            }
            k++;
        }
        if(i==arr1.length){ // arr1 array khatam arr2 ke bache hue element lo
            while(j<arr2.length){
                arr[k]= arr2[j];
                j++;
                k++;
            }
        }
        else{ // arr2 array khatam arr1 ke bache hue element lo
            while(i<arr1.length){
                arr[k]= arr1[i];
                i++;
                k++;
            }
        }
    }
}


