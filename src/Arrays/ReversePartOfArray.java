package Arrays;

public class ReversePartOfArray {
    static void main(String[] args) {
       int[] arr = {2,3,4,5,6,1,8,97,23,56,7,87};
        int i=3 , j= 7;
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Reverse array : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}