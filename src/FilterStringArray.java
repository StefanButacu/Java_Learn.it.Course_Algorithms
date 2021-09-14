
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class FilterStringArray {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		List <String> ans = new ArrayList<String>();
	
		for(String s: words){
			System.out.println(s);
		    if(s.length() > minLength){
		    		ans.add(s);
		    }
		    
		}
		return (String[]) ans.toArray();
	}

}