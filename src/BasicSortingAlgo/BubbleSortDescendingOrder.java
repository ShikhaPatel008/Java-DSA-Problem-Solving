package BasicSortingAlgo;

public class BubbleSortDescendingOrder {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print( ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {12,4,6,5,78,-11};
        int n = arr.length;
        print(arr);
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j= 0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr [j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        print(arr);
    }
}
