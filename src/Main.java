public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        System.out.println("Array antes da ordenação:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        cocktailShakerSort(arr);

        System.out.println("\nArray depois da ordenação:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void cocktailShakerSort(int[] arr) {
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;

        do {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    replacement(arr, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            end--;

            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    replacement(arr, i, i - 1);
                    swapped = true;
                }
            }

            start++;

        } while (swapped);
    }

    static void replacement(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
