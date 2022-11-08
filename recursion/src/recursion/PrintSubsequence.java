package recursion;

import java.util.Scanner;

public class PrintSubsequence {
	
	public static void printSs(String question, String answer) {
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		char firstChar = question.charAt(0);
		String restOfTheString = question.substring(1);
		
		printSs(restOfTheString, answer + firstChar);
		printSs(restOfTheString, answer +  "");
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String question = scn.next();
		printSs(question, "");
	}
}
