package solid.principle.dip;

public class Triplet<T, U, V> {

	private final T key;
	private final U valueKey;
	private final V value;

	public Triplet(T key, U valueKey, V value) {
		this.key = key;
		this.valueKey = valueKey;
		this.value = value;
	}

	public T getKey() {
		return key;
	}

	public U getValueKey() {
		return valueKey;
	}

	public V getValue() {
		return value;
	}	
}