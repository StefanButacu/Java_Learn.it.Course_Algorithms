import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] arg) {
		
		generate(5);
	}
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++) {
        	List<Integer> currentList = new ArrayList<>();
        	currentList.add(1);
    		for(int j = 1; j < i; j++) {
    			currentList.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
    					
    		}
        	if(i != 0)
        		currentList.add(1);
        	
        	triangle.add(currentList);
        	
        	
        }
        return triangle;

        /*for(var x: triangle) {
        	for(var y: x)
        		System.out.print(y);
        	System.out.println();
        	
        }
        */
        
    }
}
