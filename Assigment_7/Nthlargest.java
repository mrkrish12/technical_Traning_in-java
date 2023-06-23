public class Nthlargest {
    public static int findNthLargest(int[] arr, int n) {
        int len = arr.length;

        if (len < n) {
            System.out.println("Array should have at least " + n + " elements");
            return -1;
        }

        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == n - 1) {
                return arr[pivotIndex];
            } else if (pivotIndex > n - 1) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }

        return -1; // Nth largest element not found
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 15, 12 };
        int n = 4;

        int nthLargest = findNthLargest(arr, n);

        System.out.println(n + "th largest element: " + nthLargest);
    }
}
