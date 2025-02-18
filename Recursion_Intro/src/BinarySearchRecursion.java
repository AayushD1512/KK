public class BinarySearchRecursion {
    public static void main(String[] args) {
        int target = 4;
        int[] arr = {1,2,4,5,12,52,211};
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[]arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }else if(target < arr[m]){
            return search(arr,target,s,m-1);
        }else{
            return search(arr,target,m+1,e);
        }
    }
}
