package utils;

import sorting.BubbleSort;
import sorting.ISort;
import sorting.InsertionSort;
import sorting.ShellSort;

import java.util.ArrayList;
import java.util.Collection;

public class PerformanceMeasurer {
    ArrayGenerator generator = new ArrayGenerator();

    public void measureAll(){
        Collection<ISort> sorts = getSorts();
        for(ISort sort: sorts){
            measure(sort);
        }
    }

    private void measure(ISort sort){
        Comparable[]arr = generator.generate(20000);
        long from = System.currentTimeMillis();
        sort.sort(arr);
        long to = System.currentTimeMillis();

        double time = (to - from )/ 1000.0;
        System.out.println(String.format("Sort: %s. Time = %f", sort.toString(), time));
    }

    private Collection<ISort>getSorts(){
//        return Collections.singletonList("new", "new");
        Collection sorts = new ArrayList();
        sorts.add(new BubbleSort());
        sorts.add(new InsertionSort());
        sorts.add(new ShellSort());
        return sorts;
    }

}
