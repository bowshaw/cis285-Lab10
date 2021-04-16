package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	private SelectionSort list= new SelectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        arr = list.basicSelectionSort(arr);
        assertEquals(Sortedarr[0], arr[0]);
        assertEquals(Sortedarr[1], arr[1]);
        assertEquals(Sortedarr[2], arr[2]);
        assertEquals(Sortedarr[3], arr[3]);
        assertEquals(Sortedarr[4], arr[4]);
    }

    public void testNegative(){

	int[] arr = new int[5];
	    arr[0] = -8;
	    arr[1] = -9;
	    arr[2] = -7;
	    arr[3] = -10;
	    arr[4] = -2;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = -10;
	    Sortedarr[1] = -9;
	    Sortedarr[2] = -8;
	    Sortedarr[3] = -7;
	    Sortedarr[4] = -2;

	    /** add tests to check for this unit test **/
	    arr = list.basicSelectionSort(arr);
	    assertEquals(Sortedarr[0], arr[0]);
	    assertEquals(Sortedarr[1], arr[1]);
	    assertEquals(Sortedarr[2], arr[2]);
	    assertEquals(Sortedarr[3], arr[3]);
	    assertEquals(Sortedarr[4], arr[4]);

        /** Test data contains negative values only **/
    }

    public void testMixed(){

    	int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 0;
	    arr[2] = -7;
	    arr[3] = -10;
	    arr[4] = 2;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = -10;
	    Sortedarr[1] = -7;
	    Sortedarr[2] = 0;
	    Sortedarr[3] = 2;
	    Sortedarr[4] = 8;

	    /** add tests to check for this unit test **/
	    arr = list.basicSelectionSort(arr);
	    assertEquals(Sortedarr[0], arr[0]);
	    assertEquals(Sortedarr[1], arr[1]);
	    assertEquals(Sortedarr[2], arr[2]);
	    assertEquals(Sortedarr[3], arr[3]);
	    assertEquals(Sortedarr[4], arr[4]);

        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
	    int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 0;
	    arr[2] = 2;
	    arr[3] = -10;
	    arr[4] = 2;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = -10;
	    Sortedarr[1] = 0;
	    Sortedarr[2] = 2;
	    Sortedarr[3] = 2;
	    Sortedarr[4] = 8;

	    /** add tests to check for this unit test **/
	    arr = list.basicSelectionSort(arr);
	    assertEquals(Sortedarr[0], arr[0]);
	    assertEquals(Sortedarr[1], arr[1]);
	    assertEquals(Sortedarr[2], arr[2]);
	    assertEquals(Sortedarr[3], arr[3]);
	    assertEquals(Sortedarr[4], arr[4]);
        /** Test data contains duplicates **/
    }


}
