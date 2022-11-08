package recursion;

import java.util.Scanner;

public class PrintPermutations {
	
	public static void printPermutation(String question, String answer) {
		
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		for(int i = 0; i < question.length(); i++) {
			char ch = question.charAt(i);
			String questionLeft = question.substring(0, i);
			String questionRight = question.substring(i + 1);
			String restOfQuestion = questionLeft + questionRight;
			printPermutation(restOfQuestion, answer + ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String question = scn.next();
		printPermutation(question, "");
	}

}
