import searching.BinarySearch;
import sorting.BubbleSort;
import utils.PerformanceMeasurer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Integer[]arr = new Integer[]{-15, -10, 0, 1, 2, 2, 5, 6, 24, 40};
//        int result = new BinarySearch().search(arr, 34);
//        System.out.println("Result = " + result);

//        Integer[]arr = new Integer[]{-15, 0, -30, 20, 8, 15};
//
//        new BubbleSort().sort(arr);
//        System.out.println(Arrays.toString(arr));
        new PerformanceMeasurer().measureAll();
    }


}
