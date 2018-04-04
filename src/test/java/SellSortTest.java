import sorting.ISort;
import sorting.ShellSort;

public class SellSortTest extends AbstractSortTest {
    @Override
    public ISort getSort() {
        return new ShellSort();
    }
}
