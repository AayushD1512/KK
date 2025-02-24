import java.util.ArrayList;

public class DiffTypeReturn {
    public static void main(String[] args) {
        int target = 4;
        int[] arr = {1,2,4,2,52,4,21,4,2141};
        System.out.println(findAllIndex(arr,target,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> res = findAllIndex(arr, target, i+1);
        list.addAll(res);
        return list;
    }
}
