package recursion;

import java.util.Scanner;

public class PrintEncoding {
	
	public static void printEncoding(String question, String answer) {
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		} else if(question.length() == 1) {
			char ch = question.charAt(0);
			if(ch == '0') {
				return;
			} else {
				int charValue = ch - '0';
				char code = (char)('a' + charValue - 1);
				System.out.println(answer + code);
			}
		} else {
			char ch  = question.charAt(0);
			String restOfQuestion = question.substring(1);
			
			if(ch == '0') {
				return;
			} else {
				int charValue = ch - '0';
				char code = (char)('a' + charValue - 1);
				printEncoding(restOfQuestion, answer + code);
			}
			
			String charOneTwo = question.substring(0, 2);
			String stringAfter12 = question.substring(2);
			
			int charOneTwoValue = Integer.parseInt(charOneTwo);
			if(charOneTwoValue <= 26) {
				char code = (char)('a' + charOneTwoValue -1);
				printEncoding(stringAfter12, answer + code);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String question =  scn.next();
		printEncoding(question, "");
	}

}
