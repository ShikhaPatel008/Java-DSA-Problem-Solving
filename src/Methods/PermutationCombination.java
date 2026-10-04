package Methods;

import java.util.Scanner;
public class PermutationCombination {
    static int fact(int x){
        int f= 1;
        for(int i=1;i<=x;i++){
            f *= i;
        }
        return f;
    }
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        System.out.print("Enter r : ");
        int r= sc.nextInt();

        int npr= fact(n)/ fact(n-r);
        System.out.println("nPr = "+ npr);

        int ncr= fact(n) / (fact(n-r) * fact(r));
        System.out.println("nCr = "+ ncr);

    }
}
