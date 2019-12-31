public class linearSearch{
    
    int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        linearSearch test = new linearSearch();
        int[] arr = {64,25,12,22,11,37,98,47,58,20,98};
        System.out.println(test.search(arr, 12));
    }
}