package Arrays;

public class ForEachLoop {
    static void main(String[] args) {
        int [] arr ={5,6,8,2,9};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        // for each loop me hum kisi bhi element ko modify nhi krr sakte ,kyuki isme element ki copy bss banti hai a
    }
}
