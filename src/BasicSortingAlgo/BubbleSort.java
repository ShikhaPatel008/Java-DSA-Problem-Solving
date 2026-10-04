package BasicSortingAlgo;

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int [] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;
        print(arr);
//  best case T.C = O(n^2) , worst case T.C = O(n^2) , average case T.C = O(n^2)
        for(int i=0;i<n-1;i++){
            for(int j= 0 ; j<n-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr);
        }


//  BUBBLE SORT THODA SA OPTIMISED    : best case T.C = O(n) , worst case T.C = O(n^2) , average case T.C = O(n^2)
        for(int i=0;i<n-1;i++){
            boolean isSorted =true;
            // Perform Bubble Sort
            for(int j= 0 ; j<n-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                    isSorted =false;
                }
            }
            if(isSorted) break;
        }
        print(arr);

    }
}
