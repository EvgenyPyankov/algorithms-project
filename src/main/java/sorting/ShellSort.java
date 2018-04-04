package sorting;

public class ShellSort implements ISort {

    public void sort(Comparable[] arr) {
        InsertionSort insertionSort = new InsertionSort();

        int step = arr.length / 2;
        while (step > 0){
            int i = 0;
            while (i < step){
                insertionSort.sort(arr, i, step);
                i++;
            }
            step /= 2;
        }
    }

    @Override
    public String toString() {
        return "ShellSort{}";
    }
}
