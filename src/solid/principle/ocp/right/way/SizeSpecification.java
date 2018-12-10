package solid.principle.ocp.right.way;

import solid.principle.ocp.Product;
import solid.principle.ocp.Size;

public class SizeSpecification implements Specification<Product> {

	private Size size;

	public SizeSpecification(Size size) {
		this.size = size;
	}
	
	@Override
	public boolean isSpecified(Product item) {
		return item.getSize() == this.size;
	}

}
