import sorting.ISort;
import sorting.InsertionSort;

public class InsertionSortTest extends AbstractSortTest{

    @Override
    public ISort getSort() {
        return new InsertionSort();
    }
}
