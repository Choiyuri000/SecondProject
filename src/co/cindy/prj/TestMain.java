package co.cindy.prj;

import java.util.Arrays;

import co.cindy.exam1.IntMethod;
import co.cindy.exam1.MethodTest;

public class TestMain {
	public static void main(String[] args) {
		int[] arr2 = { 5, 1, 3, 2, 4};

		SelectonSort selectonSort = new SelectonSort();
		selectonSort.selectSort();
		System.out.println("====================");
		
		selectonSort.selectSort2();
	}

}
