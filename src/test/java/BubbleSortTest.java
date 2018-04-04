import sorting.BubbleSort;
import sorting.ISort;

public class BubbleSortTest extends AbstractSortTest {

    @Override
    public ISort getSort() {
        return new BubbleSort();
    }
}
