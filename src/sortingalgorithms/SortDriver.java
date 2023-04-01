package sortingalgorithms;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortDriver {
    public static void main(String[] args) throws FileNotFoundException {
        DataProvider dataProvider = new DataProvider();
        int[] arr = dataProvider.getArrayData();
        SortingAlgo sortingAlgo = getSortingAlgo();
        System.out.println("Array before sorting :");
        Arrays.stream(arr).forEach(v -> System.out.print(v + " "));
        System.out.println();
        long startTime = System.nanoTime();
        int[] result = sortingAlgo.sort(arr, arr.length);
        long endTime = System.nanoTime();
        System.out.println("Array after sorting :");
        Arrays.stream(result).forEach(v -> System.out.print(v + " "));
        System.out.println();
        System.out.println("Time taken: " + (endTime - startTime) + "ns");
    }

    private static SortingAlgo getSortingAlgo() {
        System.out.println("\t\t1. Bubble Sort");
        System.out.println("\t\t2. Selection Sort");
        System.out.println("\t\t3. Insertion Sort");
        System.out.println("\t\t4. Quick Sort");
        System.out.println("\t\t5. Merge Sort");
        System.out.print("Which sort to apply?");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return new BubbleSort();
            case 2:
                return new SelectionSort();
            case 3:
                return new InsertionSort();
            case 4:
                return new QuickSort();
            case 5:
                return new MergeSort();
            default:
                System.out.println("invalid choice");
                return null;
        }
    }
}
