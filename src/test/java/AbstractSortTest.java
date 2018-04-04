import org.junit.Test;
import sorting.BubbleSort;
import sorting.ISort;

import static org.junit.Assert.assertArrayEquals;

public abstract class AbstractSortTest {

    @Test
    public void intSort(){
        ISort bubbleSort = getSort();
        Comparable[]arr = {1, -100, 20, 15, 10, 0, 10};
        Comparable[]expected = {-100, 0, 1, 10, 10, 15, 20};
        bubbleSort.sort(arr);

        assertArrayEquals(expected, arr);

    }

    @Test
    public void stringSort(){
        ISort bubbleSort = getSort();
        Comparable[]arr = {"hey", "a", "you", "hello"};
        Comparable[]expected = {"a", "hello", "hey", "you"};
        bubbleSort.sort(arr);

        assertArrayEquals(expected, arr);

    }

    public abstract ISort getSort();
}
