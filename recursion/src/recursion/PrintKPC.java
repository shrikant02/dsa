package recursion;

import java.util.Scanner;

public class PrintKPC {
	
	static String[] codes = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void printKPC(String question, String answer) {
		
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		char ch = question.charAt(0);
		String restOfQuestion = question.substring(1);
		
		String codeforch = codes[ch - '0'];
		for(int i = 0; i < codeforch.length(); i++) {
			char charOption = codeforch.charAt(i);
			printKPC(restOfQuestion, answer + charOption);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String question  = scn.next();
		printKPC(question, "");
	}

}
