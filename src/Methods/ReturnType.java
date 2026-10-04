package Methods;

public class ReturnType {
    public static int  fun(int a){
        System.out.println("Good Afternoon");
        if(a>0) return 4;  // function khatam agar if statement execute hua toh , it is similar to break statement
        else return 10;
    }
    static void main(String[] args) {
        int x= fun(8); // Good AfterNoon print hoga , x ke andar 4 store hoga , since if part execute hua hai fun() ka
        System.out.println(x+8);  // Good Afternoon and 4 (return value of fun) both are printed
        //fun(5);  // stand alone call lagayi hai bss
    }
}
