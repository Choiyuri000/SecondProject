package co.cindy.prj;

public class SelectonSort {
	private int[] arr = { 5, 1, 3, 2, 4 };

	public void selectSort() { // 전통적 선택소트
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // asc sort < desc sort
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int n : arr) {
			System.out.print(n + " : ");
		}
	}

	public void selectSort2() { // 진화된 선택소트
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		} //sort end
		for (int n : arr) {
			System.out.print(n + " : ");
		}
	} // method end
	
	
	
}
