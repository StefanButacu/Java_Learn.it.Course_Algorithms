
/**
 *
 * @author STF-PC
 *
 */
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;


public class HelloWorld {
/**
 * @param - args- input args
 * 
 */
	public static void main(String[] args) {
		/**
		 * 
		 * @see
		 *  
		 */
		Integer i1 = 150;
		Integer i2 = 150;
		int myInt = 150;
		System.out.println("i1 == myInt "+ (i1 == myInt));
		
		Integer i3 = 101;
		System.out.println("i1 == i2" + (i1 == i2));
		System.out.println("i1 == i2" + (i1.equals(i2)));
		
		i1 += 1;
		System.out.println("i1=" + i1 + "i2= "+ i2);
		System.out.println("i1 == i2" + (i1 == i2));
		System.out.println("i1 == i3" + (i1 == i3));
		
	}
}
