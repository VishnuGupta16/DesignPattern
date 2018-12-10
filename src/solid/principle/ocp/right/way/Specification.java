package solid.principle.ocp.right.way;

public interface Specification<T> {
	
	boolean isSpecified(T item);
	
}
