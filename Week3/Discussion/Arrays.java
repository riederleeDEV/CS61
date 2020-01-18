public class Arrays{


    public static int[] insert(int[] arr, int item, int position) {
        int size = arr.length;
        int[] result = new int[size+1];

        for(int i = 0; i < position; i++){
            result[i] = arr[i];
        }

        result[position] = item;

        for(int j = position + 1; j < result.length; j++){
            result[j] = arr[j-1];
        }

        return result;
    }

    public static void reverse(int[] arr){
        int index = arr.length - 1;
        while(index >= 0){
            System.out.print(arr[index]+" ");
            index--;
        }
    }

    public static void main(String[] args){
        int[] x = {5, 9, 6, 14, 15};
        int[] testResult = insert(x, 100, 2);
        // for(int i = 0; i < testResult.length; i++){
        //     System.out.print(testResult[i]+"-");
        // }
        reverse(testResult);
    }
}