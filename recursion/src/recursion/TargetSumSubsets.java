package recursion;

import java.util.Scanner;

public class TargetSumSubsets {
	
	public static void printTargetSumSubsets(int[] arr, int index, String set, int sumOfSet, int target) {
		
		if(index == arr.length) {
			if(sumOfSet == target)
			System.out.println(set + ".");
			return;
		}
		
		printTargetSumSubsets(arr, index + 1, set + arr[index] + ", ", sumOfSet + arr[index], target);
		printTargetSumSubsets(arr, index + 1, set , sumOfSet , target);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n  = scn.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		printTargetSumSubsets(arr, 0, "", 0, target);
	}
}
