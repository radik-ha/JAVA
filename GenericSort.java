import java.util.Arrays;
import java.util.Scanner;

// Subprogram class (sorting & printing)
class GenericUtils {

    // Generic method to sort any type of array
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Main class
public class GenericSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Integer Array ---
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        System.out.println("Original Integer Array:");
        GenericUtils.printArray(intArray);
        GenericUtils.sortArray(intArray);
        System.out.println("Sorted Integer Array:");
        GenericUtils.printArray(intArray);

        // --- String Array ---
        System.out.print("\nEnter number of strings: ");
        int m = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] strArray = new String[m];
        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            strArray[i] = sc.nextLine();
        }

        System.out.println("Original String Array:");
        GenericUtils.printArray(strArray);
        GenericUtils.sortArray(strArray);
        System.out.println("Sorted String Array:");
        GenericUtils.printArray(strArray);

        // --- Double Array ---
        System.out.print("\nEnter number of doubles: ");
        int d = sc.nextInt();
        Double[] doubleArray = new Double[d];
        System.out.println("Enter " + d + " doubles:");
        for (int i = 0; i < d; i++) {
            doubleArray[i] = sc.nextDouble();
        }

        System.out.println("Original Double Array:");
        GenericUtils.printArray(doubleArray);
        GenericUtils.sortArray(doubleArray);
        System.out.println("Sorted Double Array:");
        GenericUtils.printArray(doubleArray);

        
    }
}
