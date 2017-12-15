package LeeHaNeul.lab;

public class Lab10 {

	public static void main(String[] args) {

		// 연습문제 5-1
		//
		// int[] arr[];
		// int[]arr1= {1,2,3,};
		// int[]arr2= new int[5];
		// int[]arr3= new int[5] {1,2,3,4,5}; // int[]arr3={1,2,3,4,5};
		// int arr4[5]; // int[] arr4 = new arr4[5];
		// int[] arr5[] = new int[3][];

		// 연습문제 5-4
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int tot = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				tot += arr[i][j];
				System.out.println(tot);
			}
		}

		avg = tot / (float) (arr.length * arr[0].length);
		System.out.println("tot=" + tot);
		System.out.println("avg=" + avg);

	}

}
