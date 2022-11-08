package recursion;

import java.util.Scanner;

public class FloodFill {
	
	public static void floodfill(int[][] maze, int row, int col, String path, boolean[][] visited) { // negative base case
		if(row < 0 || col < 0 || row == maze.length || col == maze[0].length
				|| maze[row][col] == 1 || visited[row][col] == true) {
			return;
		}
		
		if(row == maze.length - 1 && col == maze[0].length - 1) { // positive base case
			System.out.println(path);
			return; 
		}
		
		visited[row][col] = true;
		floodfill(maze, row - 1, col, path + "t", visited); // top
		floodfill(maze, row, col - 1, path + "l", visited); // left
		floodfill(maze, row + 1, col, path + "d", visited); // down
		floodfill(maze, row, col + 1, path + "r", visited); // right
		visited[row][col] = false;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] maze  = new int[n][m];
		
		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[0].length; j++) {
				maze[i][j] = scn.nextInt();
			}
		}
		boolean[][] visited = new boolean[n][m];
		floodfill(maze, 0, 0, "", visited);
	}
}

// if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1) 
// we need specify obstacle condition if last because or will return if only first condition is true
// first 4 condition makes sure that we inside the maze 
// and after that we will check obstacle condition because if we check the obstacle condition before
// and we are outside the maze our recursion will start and will throw IndexOutOfBoundException
