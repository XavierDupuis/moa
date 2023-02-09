package moa.search;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

public class BinarySearchTest extends TestCase {
    BinarySearch mBinarySearcher = null;

    @Before
    protected void setUp(){
        mBinarySearcher = new BinarySearch();
    }

    @After
    protected void tearDown(){
        mBinarySearcher = null;
    }

    public void test_GIVEN_anEmptyArray_WHEN_searchingFor4_THEN_returnsFalse() {
        int[] array = new int[]{};
        boolean result = mBinarySearcher.Search(array,4);
        assertFalse(result);
    }

    public void test_GIVEN_anOrderedArrayContaining3_WHEN_searchingFor3_THEN_returnsTrue() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = mBinarySearcher.Search(array,3);
        assertTrue(result);
    }

    public void test_GIVEN_aReversedArrayContaining5_WHEN_searchingFor5_THEN_returnsTrue() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        boolean result = mBinarySearcher.Search(array,5);
        assertTrue(result);
    }

    public void test_GIVEN_anOrderedArrayNotContaining9_WHEN_searchingFor9_THEN_returnsFalse() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = mBinarySearcher.Search(array,9);
        assertFalse(result);
    }

    public void test_GIVEN_aReversedArrayNotContaining9_WHEN_searchingFor9_THEN_returnsFalse() {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        boolean result = mBinarySearcher.Search(array,9);
        assertFalse(result);
    }
}