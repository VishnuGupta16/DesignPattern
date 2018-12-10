package solid.principle.ocp.right.way;

import java.util.List;

public class AndSpecification<T> implements Specification<T> {

	private List<Specification<T>> specificationList;
	
	public AndSpecification( List<Specification<T>> specificationList) {
		if(specificationList == null)
			throw new RuntimeException("Specification list cannot be null");
		this.specificationList = specificationList;
	}
	
	@Override
	public boolean isSpecified(T item) {
		boolean flag = true;
		
		if(specificationList.isEmpty())
			throw new RuntimeException("Specification list is empty");
		
		for (Specification<T> specification : specificationList) {
			if(!specification.isSpecified(item)) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	
}
