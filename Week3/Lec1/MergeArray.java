import java.util.Arrays; 


public class MergeArray{
    public static int[] merge(int[] A, int[] B){
        int[] C = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < A.length && j < B.length){
            if (A[i] > B[j]){
                C[k] = B[j];
                j += 1;
                k += 1;
            } else {
                C[k] = A[i];
                i += 1;
                k += 1;
            }
        }

        while (i < A.length){
            C[k] = A[i];
            i += 1;
            k += 1;
        }

        while (j < B.length){
            C[k] = B[j];
            j += 1;
            k += 1;
        }

        return C;
    }

    public static void main(String[] args){
        int[] sampleA = {-1,0,2,3,9,16};
        int[] sampleB = {1,4,5,7,8};
        int[] resultArray = merge(sampleA, sampleB);
        System.out.println(Arrays.toString(resultArray));
    }
}