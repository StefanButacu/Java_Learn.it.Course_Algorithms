package HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {

	private int capacity;
	
	@Override
	public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
		if (size() > this.capacity) {
			return true;
		}
		return false;
	}
	
	@Override
	public int get(int key) {
		// TODO Auto-generated method stub
		if(super.get(key) != null)
			return super.get(key);
		return -1;
	}

	@Override
	public void put(int key, int value) {
		// TODO Auto-generated method stub
		super.put(key, value);
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;

	}

}
