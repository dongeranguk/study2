package study2.generic;

public class Pair<K, V> {

	private K key;
	private V value;
	
	public Pair() {}
	
	public Pair(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setKey(K k) {
		this.key = k;
	}
	
	public void setValue(V v) {
		this.value = v;
	}
}
