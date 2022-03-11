import java.util.Arrays;

public class InsertionSort {
    int [] insertionSort(int[] arr){

        int size = arr.length;

        for(int step = 1; step < size; step++){
            int key = arr[step];
            int j = step -1;

            while (j>=0 && key < arr[j]){
                arr[j + 1 ] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    //Time Complexity is O(n^2) n is the size of the array //the nested loop makes it squared
    


    public static void main(String[] args) {
//        int[] numbers = {5,2,4,3,10,7,1,9,6,8};
        InsertionSort is = new InsertionSort();
//        is.insertionSort(numbers);
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(is.insertionSort(new int[] {5,2,4,3,10,7,1,9,6,8})));


    }
}
