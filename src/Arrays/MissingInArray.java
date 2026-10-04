package Arrays;

public class MissingInArray {
    static void main(String[] args) {
        int [] arr= {1,2,5,3,4,7,8};
        int n= arr.length +1;// 1 se n tak numbers honge arr me
        int sum= n*(n+1)/2;
        int arraySum=0;
        for (int ele : arr){
            arraySum += ele;
        }
        System.out.println("Missing element : "+(sum - arraySum));
    }
}
