public class binarySearch {
    boolean search(int[] arr, int target){
        int first = 0;
        int last = arr[arr.length-1];
        while (first<=last){
            int midpoint = (int)Math.ceil(first+last);
            if (target == midpoint){
                return true;
            } else {
                if (target < midpoint){
                    last = midpoint-1;
                } else {
                    first = midpoint + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        binarySearch test = new binarySearch();
        int[] testA = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println(test.search(testA, 10));
    }
}