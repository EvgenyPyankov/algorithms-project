package sorting;

public class BubbleSort implements ISort {
    public void sort(Comparable[] arr) {
        for (int i = 0; i<arr.length - 1; i++){
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    Comparable buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort{}";
    }
}
