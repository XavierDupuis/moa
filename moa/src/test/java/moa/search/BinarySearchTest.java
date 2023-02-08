package moa.search;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BinarySearchTest  extends TestCase {
    int[] array1;
    int[] array2;
    int[] array3;
    // assigning the values
    protected void setUp(){
        array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        array2 = new int[]{};
        array3 = new int[]{6, 5, 4, 3, 2, 1};

    }

    public void testEmptyArray(){
        int result = new BinarySearch().Search(array2,8);
        assertEquals(result, -1);
    }

    public void testOrderedArray(){
        int result = new BinarySearch().Search(array1,3);
        assertEquals(result, 2);
    }
    public void testInversedArray(){
        int result = new BinarySearch().Search(array3,5);
        assertEquals(result, 4);
    }
}