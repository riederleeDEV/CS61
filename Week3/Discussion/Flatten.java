public class Flatten {
    public static int[] flatten(int[][] x) {
        int totalLength = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i].length > 0) {
                for (int j = 0; j < x[i].length; j++) {
                    totalLength += 1;
                }
            }
        }

        int[] a = new int[totalLength];
        int aIndex = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i].length > 0) {
                for (int j = 0; j < x[i].length; j++) {
                    a[aIndex] = x[i][j];
                    aIndex += 1;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] tempArr = {{1, 2, 3}, {6,6,6}, {7, 8}};
        int[] test = flatten(tempArr);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
    }
}
