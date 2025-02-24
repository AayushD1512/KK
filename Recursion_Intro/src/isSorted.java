public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,5,61,7,89,89};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]<=arr[i+1]){
            return isSorted(arr,i+1);
        }
        return false;
    }
}
