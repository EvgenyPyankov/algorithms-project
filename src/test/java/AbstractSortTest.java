import org.junit.Before;
import org.junit.Test;
import sorting.ISort;
import utils.ArrayGenerator;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public abstract class AbstractSortTest {
    private static ISort sort;
    private static ArrayGenerator generator;

    @Before
    public void setUp() {
        sort = getSort();
        generator = new ArrayGenerator();
    }

    @Test
    public void intSort() {
        //ISort sort = getSort();
        Comparable[] arr = {1, -100, 20, 15, 10, 0, 10};
        Comparable[] expected = {-100, 0, 1, 10, 10, 15, 20};
        sort.sort(arr);

        assertArrayEquals(expected, arr);

    }

    @Test
    public void stringSort() {
        //ISort sort = getSort();
        Comparable[] arr = {"hey", "a", "you", "hello"};
        Comparable[] expected = {"a", "hello", "hey", "you"};
        sort.sort(arr);

        assertArrayEquals(expected, arr);

    }

    @Test
    public void singleIntSort() {
        //ISort sort = getSort();
        Comparable[] arr = {1};
        Comparable[] expected = {1};
        sort.sort(arr);

        assertArrayEquals(expected, arr);

    }

    @Test
    public void randomIntArraySort() {
        int n = 1000;
        Comparable[] arr = generator.generate(n);
        Comparable[] expected = arr.clone();
        sort.sort(arr);
        Arrays.sort(expected);

        assertArrayEquals(expected, arr);
    }

    public abstract ISort getSort();
}
