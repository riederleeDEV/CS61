import java.util.Arrays; 


public class CopyArray {

    static void insert(String[] arr, int k, String x){
        String[] result = new String[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        for(int i = result.length-1; i > k; i--){
            result[i] = result[i-1];
        }
        result[k] = x;
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args){
        String[] sample = {"bear", "gazelle", "hartebeest", "skunk"};
        insert(sample, 2, "gnu");
    }
}