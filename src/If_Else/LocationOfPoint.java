package If_Else;
import java.util.Scanner;

public class LocationOfPoint {
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        if(x>0 && y>0)
            System.out.println("Point lies in 1st quadrant");
        else if(x<0 && y>0)
            System.out.println("Point lies in 2nd quadrant");
        else if(x<0 && y<0)
            System.out.println("Point lies in 3rd quadrant");
        else if(x>0 && y<0)
            System.out.println("Point lies in 4th quadrant");
        else if(x==0 && y!=0)
            System.out.println("Point lies on Y axis");
        else if(x!=0 && y==0)
            System.out.println("Point lies in X axis");
        else
            System.out.println("Point lies on origin");
    }
}
