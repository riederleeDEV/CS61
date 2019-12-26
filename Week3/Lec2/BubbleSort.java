public class BubbleSort{


    

    void sort(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
                    continue;
                }
            }
        }
    }


    void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        BubbleSort test = new BubbleSort();
        int[] testArray = {64,25,12,22,11,37,98,47,58,20,98};
        test.sort(testArray);
        test.print(testArray);
    }
}