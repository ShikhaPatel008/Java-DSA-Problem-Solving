package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price : ");
        double sp = sc.nextDouble();

        if(cp==sp) System.out.println("No profit no loss");
        else if (cp>sp){
            System.out.println("loss = " + (cp-sp));
            System.out.println("loss percentage = " + (cp-sp)*100/cp);
        }
        else{
            System.out.println("Profit = " + (sp-cp));
            System.out.println("profit percentage = " + (sp-cp)*100/sp);
        }

    }
}
