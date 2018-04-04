package searching;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch implements ISearch {
    public int search(Comparable[] arr, Comparable searchElement) {
        Arrays.sort(arr, new Comparator<Comparable>() {
            public int compare(Comparable o1, Comparable o2) {
                return 0;
            }
        });
        int start = 0;
        int end = arr.length;
        int mid;

        int result = -1;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid].compareTo(searchElement) == 0) {
                result = mid;
                break;
            } else {
                if (arr[mid].compareTo(searchElement) > 0) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
