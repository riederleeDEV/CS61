public class ThreeSum {
    public boolean threeSum(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for(int k = 0; k < a.length; k++){
                    if (a[i] + a[k] + a[j] == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] TestArray = {8, 2, -1, -1, 15};
        ThreeSum test  = new ThreeSum();
        System.out.println(test.threeSum(TestArray));
    }
}