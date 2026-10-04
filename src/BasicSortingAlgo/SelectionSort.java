package BasicSortingAlgo;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print( ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {2 ,3,4,1,6,8,0,-54};
        int n= arr.length;
        print(arr);
        for(int i=0; i<n-1; i++){
            int min = arr[i];
            int mindx= i;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
