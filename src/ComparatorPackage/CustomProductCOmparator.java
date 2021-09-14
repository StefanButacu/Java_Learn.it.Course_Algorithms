package ComparatorPackage;

import java.util.Comparator;
/*Create comparator type for Product type that would sort by category name. 
 * In case categories are the same - products with the lower price should go first. 
 * In case price is the same - sort product by product names.  

 * 
 * 
 */
public class CustomProductCOmparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		if(  o1.getCategoryName().compareTo(o2.getCategoryName()) < 0)
			return -1;
		else if(o1.getCategoryName().compareTo(o2.getCategoryName()) > 0) 
				return 1;
		else{
				// equal categories 
				if( o1.getPrice() < o2.getPrice())
					return -1;
				else if(o1.getPrice() > o2.getPrice())
					return 1;
				else 
					// equal prices
					return o1.getProductName().compareTo(o2.getProductName());
					
			}

}

}
	