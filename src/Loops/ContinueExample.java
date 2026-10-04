package Loops;

public class ContinueExample {
    static void main(String[] args) {
        for(int i=1; i<=100;i++){
            if(i%2!=0) continue; //skip this iteration
            System.out.print(i + " ");
        }
    }
}
