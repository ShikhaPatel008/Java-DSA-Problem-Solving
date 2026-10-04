package Arrays;

public class ArrayOfOtherDatatypes {
    static void main(String[] args) {
        //default values
        double [] arr = new double[5];
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " "); //default value of double type array = 0.0
        }
        System.out.println();
        char [] brr = new char[5];
        for(int i=0; i<5; i++){
            System.out.print(brr[i] + " "); //default value of char type array = null character
        }
        System.out.println();

        //array of string
        String [] srr = {"Shikha", "Soumya", "Ronak", "Khushboo"};
        for(int i=0; i<4; i++){
            System.out.print(srr[i] + " ");
        }



    }

}
