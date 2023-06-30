public class Bitwise {
    static int MaxValue(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int bitwise = arr[i] & arr[j];
                if (max < bitwise) {
                    max = bitwise;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        // System.out.println((n >> 2) + (n << 2));
        // System.out.println((a & (~b)) | (~a & b));
        int arr[] = { 18, 5, 2, 10, 12 };
        System.out.println(MaxValue(arr));
    }
}
