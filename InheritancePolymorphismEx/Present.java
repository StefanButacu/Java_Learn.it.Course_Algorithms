import java.util.Arrays;

public class Present {
	Sweet[] array = new Sweet[100];
	private int index = 0;
	// the method filters sweets by sugar weight inclusively 
	
	
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		Sweet[] result = new Sweet[index];
		int i = 0;
		for(Sweet s: array) {
			if( minSugarWeight <= s.sugarWeight && s.sugarWeight <= maxSugarWeight)
			{
				result[i] = s;
				i++;
				
			}
			
			
		}
		
		return result;
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		double totalWeight = 0;
		for(Sweet s: array) {
			totalWeight += s.weight;
			
		}
		return totalWeight;
	}

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		array[index] = sweet;
		index++;
	}

	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	public Sweet[] getSweets() {
		return Arrays.copyOf(array, index);
	}

}
