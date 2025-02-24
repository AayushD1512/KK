public class FindTarget {
    public static void main(String[] args) {
        int target = 4;
        int[] arr = {1,2,7,4,64,231,43};
        System.out.println(findNum(arr,target,0));
    }
    static int findNum(int[] arr, int target, int i){
        // Base Condition to terminate the program when i reaches the end means target not found
        if(i==arr.length){
            return -1;
        }
        // Condition when match happens to directly return the index of the target element
        if(arr[i]==target){
            return i;
        }

        // Recurrence Relation to recursively find the target element.
        return findNum(arr,target,i+1);
    }
}
