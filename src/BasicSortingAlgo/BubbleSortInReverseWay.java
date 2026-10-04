package BasicSortingAlgo;

public class BubbleSortInReverseWay {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {2,4,1,-9,6,45,6};
        int n = arr.length;
        print(arr);
        for(int i=0; i<n-1 ; i++){
            boolean isSorted =true;
            for(int j= n-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        print(arr);
    }
}
