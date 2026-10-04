package BasicSortingAlgo;
import java.util.Arrays;

public class TwoSumSelectionSort {
    static void main(String[] args) {
        int []arr = {2,4,1,-9,6,45,6};
        int n = arr.length;
        int targetSum = 7;
        Arrays.sort(arr);  // time = n*log n , space = n
        int i = 0;
        int j = n-1;
        boolean twoSum = false;
        while(i<j){  // time = n
            if(arr[i] + arr[j] == targetSum){
                twoSum = true;
            }
            else if(arr[i] + arr [j] < targetSum){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(twoSum);
    }
}

