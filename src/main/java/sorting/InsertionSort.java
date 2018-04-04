package sorting;

public class InsertionSort implements ISort{
    public void sort(Comparable[] arr) {
        sort(arr, 0, 1);

//        int step = 1;
//        for (int j = step; j<arr.length; j+=step){
//            Comparable key = arr[j];
//            int i = j-step;
//            while (i>=0 && arr[i].compareTo(key)>0){
//                arr[i+step] = arr[i];
//                i-=step;
//            }
//            arr[i+step] = key;
//        }
    }

    public void sort(Comparable[]arr, int start, int step){
        for (int j = start+step; j<arr.length; j+=step){
            Comparable key = arr[j];
            int i = j-step;
            while (i>=start && arr[i].compareTo(key)>0){
                arr[i+step] = arr[i];
                i-=step;
            }
            arr[i+step] = key;
        }
    }

    @Override
    public String toString() {
        return "InsertionSort{}";
    }
}
