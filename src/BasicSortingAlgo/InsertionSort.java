package BasicSortingAlgo;

public class InsertionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {4,2,8,1,0,4,6,3};
        int n = arr.length;
        print(arr);

        // insertion sort algorithm
        for(int i =1 ; i< n; i++){
            int j= i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j--;

            }
        }
        print(arr);
    }
}
