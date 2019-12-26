public class SelectionSort{

    void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (i != arr.length - 1){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] < arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } 
            } else {
                break;
            }
        }
    }

    void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        SelectionSort test = new SelectionSort();
        int[] testArray = {64,25,12,22,11,37,98,47,58,20,98};
        test.sort(testArray);
        test.print(testArray);
    }
}