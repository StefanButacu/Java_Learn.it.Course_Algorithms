package SplitWords;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(Arrays.toString(input.split("(![ !,\\.\\?])+")));
		
		int amountOfWords = getWordsAmount(input) +1;
		
		System.out.println("Amount of words in your text: " + amountOfWords);
		
	}

public static int getWordsAmount(String text) {
    int counter = 0;
	for(char c: text.toCharArray())
	    if(c == ' ')
	        counter++;
    return counter;
    
}
}