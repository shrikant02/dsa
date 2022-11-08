package recursion;

import java.util.Scanner;

public class PrintMazePathsWithJump {
	
	public static void printMazePaths(int sr, int sc, int dr, int dc, String answer) {
		
		if(sr == dr && sc == dc) {
			System.out.println(answer);
			return;
		}
		
		for(int moveSize = 1; moveSize <= dc - sc; moveSize++) {
			printMazePaths(sr, sc + moveSize, dr, dc, answer + "h" + moveSize);
		}
		
		for(int moveSize = 1; moveSize <= dr - sr; moveSize++) {
			printMazePaths(sr + moveSize, sc, dr, dc, answer + "v" + moveSize);
		}
		
		for(int moveSize = 1; moveSize <= dr - sr && moveSize <= dc - sc; moveSize++) {
			printMazePaths(sr + moveSize, sc + moveSize, dr, dc, answer + "d" + moveSize);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		printMazePaths(1, 1, n, m, "");
	}

}
