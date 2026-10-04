package Arrays;
import java.util.Scanner;

public class Merge2SortedArrayAnotherMethod {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of 1st array : ");
        int n= sc.nextInt();
        int [] a= new int[n];
        System.out.print("Enter sorted elements of 1st array : ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter size of 2nd array : ");
        int m= sc.nextInt();
        int [] b= new int[m];
        System.out.print("Enter sorted elements of 2nd array : ");
        for(int j=0; j<m; j++){
            b[j]=sc.nextInt();
        }

        int [] c= new int[n+m];
        for(int ele: c){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("Combined(merged) sorted array : ");
        merge(c,a,b);
        for(int ele: c){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=a.length-1 , j= b.length-1 , k= c.length;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k]= a[i];
                i--;
            }else{
                c[k]= b[j];
                j--;
            }
            k--;
        }

        if(i<0){
            while(j>=0){
                c[k]=b[j];
                j--;
                k--;
            }
        }else{
            while(i>=0){
                c[k]=a[i];
                i--;
                k--;
            }
        }
    }
}
