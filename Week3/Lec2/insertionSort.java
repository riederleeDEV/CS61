public class insertionSort{
    
    void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }


    void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        insertionSort test = new insertionSort();
        int[] testArray = {64,25,12,22,11,37,98,47,58,20,98};
        test.sort(testArray);
        test.print(testArray);
    }
}