package sortingalgorithms;

public class MergeSort implements SortingAlgo {
    @Override
    public int[] sort(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
        return arr;
    }

    private void mergeSort(int a[], int l, int r) {
        int mid;

        if (l < r) {
            mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, mid + 1, r);//merging of two sorted sub-arrays
        }
    }

    private void merge(int a[], int i1, int j1, int i2, int j2) {
        int[] temp = new int[j2+1];    //array used for merging
        int i = i1;    //beginning of the first list
        int j = i2;    //beginning of the second list
        int k = 0;

        while (i <= j1 && j <= j2) {
            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= j1)    //copy remaining elements of the first list
            temp[k++] = a[i++];

        while (j <= j2)    //copy remaining elements of the second list
            temp[k++] = a[j++];

        //Transfer elements from temp[] back to a[]
        for (i = i1, j = 0; i <= j2; i++, j++)
            a[i] = temp[j];
    }
}
