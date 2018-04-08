import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
	
	Sorting sorting;
	
	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		sorting = new Sorting();
		int[] arr = { 6, 3, 2, 1 };
		sorting.arr = arr;
		sorting.sortArray("I");
	}
	
	@Test
	public void test2() {
		sorting = new Sorting();
		int[] arr = { 6, 3, 2, 1 };
		sorting.arr = arr;
		sorting.sortArray("M");
		assertTrue(Sorting.isSorted("M"));
	}
	
	@Test
	public void test3() {
		sorting = new Sorting();
		int[] arr = { 6, 3, 2, 1 };
		sorting.arr = arr;
		sorting.sortArray("R");
		assertTrue(Sorting.isSorted("R"));
	}
	
	@Test
	public void test4() {
		sorting = new Sorting();
		sorting.arr = new int[] { 1, 2, 3, 6 };
		assertTrue(Sorting.isSorted("R"));
	}
	
	@Test
	public void test5() {
		sorting = new Sorting();
		sorting.arr = new int[] { 6, 3, 2, 1 };
		assertTrue(Sorting.isSorted("M"));
	}
}