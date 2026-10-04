package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25); // adding elements to arraylist
        arr.add(21);
        arr.add(20);
        arr.add(18);
        arr.add(5);

        System.out.println(arr.get(2)); // fetching element present at index 2 in arraylist i.e arr[2]
        arr.set(3, 50);// changing value at index 3 to 50 1.e arr[3] = 50

        System.out.println(arr); // not traversing the array by ourselves
        int n = arr.size(); // arr.length
        for (int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // 25 21 20 50 5
        arr.add(78);// 25 21 20 50 5 78
        arr.add(1,100); // 25 100 21 20 50 5 78
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        // reversing arraylist manually
        int i=0, j= arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);

    }
}
