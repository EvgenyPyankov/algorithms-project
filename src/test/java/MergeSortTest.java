import sorting.ISort;
import sorting.MergeSort;

public class MergeSortTest extends AbstractSortTest {

    @Override
    public ISort getSort() {
        return new MergeSort();
    }
}
