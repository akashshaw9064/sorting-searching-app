package sortingalgorithms;

public class QuickSort implements SortingAlgo {

    @Override
    public int[] sort(int[] arr, int n) {
        quick(arr, 0, n - 1);
        return arr;

    }

    private void quick(int a[], int low, int up) {
        int l, r, p, piv, t;
        l = low;
        r = up;
        p = l;
        piv = low;
        if (low >= up)
            return;
        while (true) {
            while (a[r] >= a[piv] && piv != r)
                r = r - 1;
            if (piv == r) {
                p = 1;
                break;
            }
            if (a[r] < a[piv]) {
                t = a[piv];
                a[piv] = a[r];
                a[r] = t;
                piv = r;
            }
            while (a[l] <= a[piv] && l != piv)
                l = l + 1;
            if (piv == l) {
                p = 1;
                break;
            }
            if (a[l] > a[piv]) {
                t = a[piv];
                a[piv] = a[l];
                a[l] = t;
                piv = l;
            }
        }
        quick(a, low, piv - 1);
        quick(a, piv + 1, up);
    }
}
