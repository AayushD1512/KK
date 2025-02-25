import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4,2,41,23,1};
        bubbleSortRecursive(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortRecursive(int[] arr, int i, int j){
        if(i==0){
            return;
        }

        if(j<i){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubbleSortRecursive(arr,i,j+1);
        }else {
            bubbleSortRecursive(arr,i-1,0);
        }
    }
}
