package If_Else;
import java.util.Scanner;

public class AreaPerimeter {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length : ");
        int l =sc.nextInt();
        System.out.print("Enter breadth : ");
        int b =sc.nextInt();
        int A = l*b;
        int P = 2*(l+b);
        System.out.println("Area of rectangle = "+ A);
        System.out.println("Perimeter of rectangle = "+ P);
        if(A>P)
            System.out.println("Area is greater than perimeter");
        else
            System.out.println("Area is less than perimeter");
    }
}
