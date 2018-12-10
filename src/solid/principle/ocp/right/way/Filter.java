package solid.principle.ocp.right.way;

import java.util.stream.Stream;

public interface Filter<T> {

	default Stream<T> filter(Stream<T> items, Specification<T> specification){
		return items.filter(p -> specification.isSpecified(p));
	}
	
}
