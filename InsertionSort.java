import java.util.Scanner;

class Sort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class InsertionSort{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        Sort obj = new Sort();
        obj.sort(a);
    }
}
