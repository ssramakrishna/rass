package seleNIum;

import java.util.Scanner;

public class _2dA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number");
		int row = sc.nextInt();
		System.out.println("Enter column number");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {           //Taking values
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < arr.length; k++) {    // printing
			for (int j = 0; j < arr[k].length; j++) {
				System.out.print(arr[k][j] + " ");
			}
			System.out.println(" ");
		}

		int[][] r = new int[row][col];

		for (int l = 0; l < arr.length; l++) {  //adding to another array
			for (int j = 0; j < arr[l].length; j++) {
				r[l][j] = arr[l][j];
			}
			System.out.println(" ");
		}

	}

}
