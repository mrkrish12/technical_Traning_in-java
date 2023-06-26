public class ZigZag {
    public static void convertToZigZag(int[] arr) {
        int n = arr.length;
        boolean isLess = true;
        for (int i = 0; i < n - 1; i++) {
            if (isLess) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i + 1, i);
                }
            }
            isLess = !isLess;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
        System.out.println("Original array:");
        printArray(arr);
        convertToZigZag(arr);
        System.out.println("Zigzag array:");
        printArray(arr);
    }
}