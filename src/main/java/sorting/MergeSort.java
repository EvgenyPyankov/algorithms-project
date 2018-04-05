package sorting;

import sorting.ISort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSort implements ISort {
    public void sort(Comparable[] arr) {
        merge(arr, 0, arr.length);

    }

    private void merge(Comparable[] arr, int l, int r) {
        int mid = (l + r) / 2;
        if (l < mid) {
            merge(arr, l, mid);
            merge(arr, mid, r);
            merge(arr, l, mid, r);
        }
    }

//    It's faster then with queues
//    public void merge(Comparable[] arr, int l, int mid, int r) {
//        Comparable[] left = Arrays.copyOfRange(arr, l, mid);
//        Comparable[] right = Arrays.copyOfRange(arr, mid, r);
//        int i = 0;
//        int j = 0;
//        for (int k = l; k < r; k++) {
//            if (i == left.length) {
//                arr[k] = right[j];
//                j++;
//            } else if (j == right.length) {
//                arr[k] = left[i];
//                i++;
//            } else {
//
//                if (left[i].compareTo(right[j]) > 0) {
//                    arr[k] = right[j];
//                    j++;
//                } else {
//                    arr[k] = left[i];
//                    i++;
//                }
//            }
//        }
//    }

//    public void merge(Comparable[] arr, int l, int mid, int r) {
//        Comparable[] leftArray = Arrays.copyOfRange(arr, l, mid);
//        Comparable[] rightArray = Arrays.copyOfRange(arr, mid, r);
//
//        Queue<Comparable> left = new LinkedList<>(Arrays.asList(leftArray));
//        Queue<Comparable> right = new LinkedList<>(Arrays.asList(rightArray));
//
//        for (int k = l; k < r; k++) {
//            if (left.peek() == null) {
//                arr[k] = right.poll();
//            } else if (right.peek() == null) {
//                arr[k] = left.poll();
//            } else {
//                if (left.peek().compareTo(right.peek()) > 0) {
//                    arr[k] = right.poll();
//                } else {
//                    arr[k] = left.poll();
//                }
//            }
//        }
//    }

    public void merge(Comparable[] arr, int l, int mid, int r) {
        Comparable[] leftArray = Arrays.copyOfRange(arr, l, mid);
        Comparable[] rightArray = Arrays.copyOfRange(arr, mid, r);

        Queue<Comparable> left = new LinkedList<>(Arrays.asList(leftArray));
        Queue<Comparable> right = new LinkedList<>(Arrays.asList(rightArray));

        int k = l;
        while (left.peek() != null && right.peek() != null) {
            if (left.peek().compareTo(right.peek()) > 0) {
                arr[k] = right.poll();
            } else {
                arr[k] = left.poll();
            }
            k++;
        }

        while (left.peek() != null) {
            arr[k] = left.poll();
            k++;
        }

        while (right.peek() != null) {
            arr[k] = right.poll();
            k++;
        }
    }


    @Override
    public String toString() {
        return "MergeSort{}";
    }
}
