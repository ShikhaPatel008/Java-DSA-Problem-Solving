package Methods;

public class Arguments {
    static void sum(int a, int b) {    // a,b are parameters
        System.out.println("Sum = " + a+b);
    }
    static void max(int a, int b, int c){
        if(a>=b && a>=c) System.out.println(a + " is maximum ");
        else if(b>=a && b>=c) System.out.println(b + " is maximum ");
        else System.out.println(c + " is maximum");
    }
    static void main(String[] args) {
        sum(9,6);     // here, 9,6 are arguments
        max(3,7,9);
    }
}
