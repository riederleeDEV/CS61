public class Max{
    /*
    Find the largest number of the list.
    If there are two same largest number, then print the second one.
    */
    public static int[] a = {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args){
        int max = a[0];
        for(int i = 0; i<a.length;i++){
            if (a[i]>=max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}