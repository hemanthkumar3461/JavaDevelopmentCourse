package SyntaxConditionalsLoops;

import java.util.Scanner;

public class E2_CountLetterDigitSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line with letter, digits and spaces.. And i will count things for u");
		String s = scanner.nextLine();
		
		char[] c = s.toCharArray();
		int spaces=0,letters=0,numbers=0,others=0;
		for(int i =0; i<s.length();i++) {
			if(Character.isDigit(c[i])) {
				numbers++;
			}
			else if(Character.isAlphabetic(c[i])) {
				letters++;
			}
			else if(Character.isSpaceChar(c[i])){
				spaces++;
			}else
			{
				others++;
			}
		
		}
		System.out.println("Spaces are" + spaces);
		System.out.println("Numbers are"+ numbers);
		System.out.println("Letters are" + letters);
		System.out.println("Others are" + others);

	}

}
