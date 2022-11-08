package dp;

import java.util.Scanner;

public class Fibonaaci {

	public static int fibMemoized(int n, int[] qb) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(qb[n] != 0) {
			return qb[n];
		}
		int fibn1 = fibMemoized(n - 1, qb);
		int fibn2 = fibMemoized(n - 2, qb);
		int fibn =  fibn1 + fibn2;
		qb[n] = fibn;
		return fibn;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fib = fibMemoized(n, new int[n + 1]);
		System.out.println(fib);
		scn.close();
	}

}
